package display;

public class StringDisplayImpl extends DisplayImpl {
    private final String string;
    private final int length;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.length = string.getBytes().length + 2;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("| " + string + " |");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
}
