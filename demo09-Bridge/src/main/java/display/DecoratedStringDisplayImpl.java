package display;

public class DecoratedStringDisplayImpl extends DisplayImpl {
    private final char start;
    private final char decorate;
    private final char end;
    public DecoratedStringDisplayImpl(char start, char decorate, char end) {
        this.start = start;
        this.decorate = decorate;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(decorate);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
