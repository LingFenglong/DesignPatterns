public class ListVisitor extends Visitor {
    private String currentDir = "";
//    @Override
//    public void visit(File file) {
//        System.out.println(currentDir + "/" + file);
//    }

    @Override
    public void visit(File file) {
        System.out.println(file.getAbsolutePath());
    }

//    @Override
//    public void visit(Directory directory) {
//        System.out.println(currentDir + "/" + directory);
//        String saveDir = currentDir;
//        currentDir = currentDir + "/" + directory.getName();
//        directory.getDirectory()
//                .forEach(entry -> entry.accept(this));
//        currentDir = saveDir;
//    }

    @Override
    public void visit(Directory directory) {
        System.out.println(directory.getAbsolutePath());
        directory.getDirectory()
                .forEach(entry -> entry.accept(this));
    }
}
