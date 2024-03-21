package display;

public class NumberDisplay extends AbstractDisplay {
    private final Number number;

    public NumberDisplay(Number number) {
        this.number = number;
    }

    @Override
    protected void open() {
        System.out.print("{{");
    }

    @Override
    protected void print() {
        System.out.print(" " + number + " ");
    }

    @Override
    protected void close() {
        System.out.println("}}");
    }
}
