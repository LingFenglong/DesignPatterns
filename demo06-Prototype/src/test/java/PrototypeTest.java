import org.junit.jupiter.api.Test;
import prototype.MessageBox;
import prototype.UnderlinePen;
import prototype.framwork.Manager;

public class PrototypeTest {
    @Test
    void prototypeTest() {
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');

        Manager manager = new Manager();
        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);

        manager.create("strong message").use("Hello world!");
        manager.create("warning box").use("Hello world!");
        manager.create("slash box").use("Hello world!");
    }
}
