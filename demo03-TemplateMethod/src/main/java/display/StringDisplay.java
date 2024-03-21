package display;

public class StringDisplay extends AbstractDisplay {
    private final String string;
    private final int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length() + 2;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("| " + string + " |");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
