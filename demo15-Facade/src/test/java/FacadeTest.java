import org.junit.jupiter.api.Test;
import pagemaker.PageMaker;

public class FacadeTest {
    @Test
    void facadeTest() {
        PageMaker.makeWelcomePage("baidu.com");
        PageMaker.makeLinkPage();
    }
}
