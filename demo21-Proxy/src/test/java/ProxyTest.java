import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    void proxyTest() {
        PrinterProxy printerProxy = new PrinterProxy("HAHAHA", Printer.class);
        printerProxy.print("99999");

        printerProxy.setPrinterName("HEHEHE");
        printerProxy.print("66666");
    }
}
