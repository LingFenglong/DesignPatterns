public class SizeVisitor extends Visitor {
    private int size = 0;
    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        directory.getDirectory()
                .forEach(entry -> entry.accept(this));
    }

    public int getSize() {
        return size;
    }
}
