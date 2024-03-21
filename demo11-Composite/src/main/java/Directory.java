import java.util.ArrayList;

public class Directory extends Entry {
    private final String name;
    private final ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return directory
                .stream()
                .map(Entry::getSize)
                .reduce(Integer::sum)
                .orElse(0);
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        entry.setParent(this);
        directory.add(entry);
        return entry;
    }

    @Override
    public void printList(String prefix, int indent) {
        printListHelper(prefix, indent);
    }

    private void printListHelper(String prefix, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(prefix + "/" + this);
        directory.forEach(entry -> entry.printList(prefix, indent + 1));
    }
}
