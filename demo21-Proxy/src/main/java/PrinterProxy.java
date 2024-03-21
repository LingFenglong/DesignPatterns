import java.lang.reflect.InvocationTargetException;

public class PrinterProxy implements Printable {
    private String name;
    private volatile Printable real;

    public PrinterProxy(Class<? extends Printable> clazz) {
        try {
            real = clazz.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public PrinterProxy(String name, Class<? extends Printable> clazz) {
        this(clazz);
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        } else {
            this.name = name;
        }
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private void realize() {
        if (real == null) {
            synchronized (PrinterProxy.class) {
                if (real == null) {
                    real = new Printer(name);
                }
            }
        }
    }
}
