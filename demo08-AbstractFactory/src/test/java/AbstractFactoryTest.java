import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    void abstractFactoryTest() {
        Factory factory = Factory.getFactory("tablefactory.TableFactory");
        Link link1 = factory.createLink("报刊1", "http://127.0.0.1");
        Link link2 = factory.createLink("报刊2", "http://127.0.0.1");
        Link link3 = factory.createLink("报刊3", "http://127.0.0.1");
        Tray tray1 = factory.createTray("The Tray1");
        Tray tray2 = factory.createTray("The Tray2");
        Page page = factory.createPage("标题", "LingFenglong");

        tray1.add(link1);
        tray1.add(link2);
        tray1.add(link3);
        tray2.add(link1);
        tray2.add(link2);

        page.add(tray1);
        page.add(tray2);

        page.output();
    }
}
