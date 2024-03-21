
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("heavyJob...");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("heavyJob... " + name);
    }

    private void heavyJob(String string) {
        for (int i = 0; i < 5; i++) {
            try { Thread.sleep(1000); } catch (InterruptedException e) { throw new RuntimeException(e); }
            System.out.print(".");
        }
        System.out.println();
        System.out.println("Heavy Job" + string);
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("====== " + name + " ======");
        System.out.println(string);
    }
}
