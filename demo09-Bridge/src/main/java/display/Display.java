package display;

public class Display {
    private final DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    protected void open() {
        displayImpl.rawOpen();
    }
    protected void print() {
        displayImpl.rawPrint();
    }
    protected void close() {
        displayImpl.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
