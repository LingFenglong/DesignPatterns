import banner.Print;
import banner.PrintBanner;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    /**
     * 通过继承来实现适配
     */
    @Test
    void adapterByExtendsTest() {
        Print print = new PrintBanner("Hello world!");
        print.printStrong();
        print.printWeek();
    }

    /**
     * 通过委托来实现适配
     */
    @Test
    void adapterByDelegate() {
        Print print = new PrintBanner("Hello world!");
        print.printStrong();
        print.printWeek();
    }
}
