import java.util.ArrayList;

public class FileFindVisitor extends Visitor {
    private final String keyword;
    private final ArrayList<File> foundFiles = new ArrayList<>();

    public FileFindVisitor(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public void visit(File file) {
        String name = file.getName();
        int index = name.lastIndexOf(".");
        if (index == -1) {
            return;
        }

        if (name.substring(index).contains(keyword)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        directory.getDirectory()
                .forEach(entry -> entry.accept(this));
    }

    public ArrayList<File> getFoundFiles() {
        return foundFiles;
    }
}
