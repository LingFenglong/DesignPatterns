package display;

import java.util.stream.IntStream;

public abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    /**
     * 规定了方法的执行流程
     *  open -> display -> close
     */
    public final void display() {
        open();
        IntStream.range(0, 5).forEach(i -> print());
        close();
    }
}
