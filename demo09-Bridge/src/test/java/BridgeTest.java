import display.*;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    void bridgeTest() {
        new Display(new StringDisplayImpl("Hello world!")).display();
    }

    @Test
    void countDisplay() {
        new CountDisplay(new StringDisplayImpl("Java")).display();
        new CountDisplay(new StringDisplayImpl("Java C#")).multiDisplay(3);
    }

    @Test
    void randomDisplay() {
        new RandomDisplay(new StringDisplayImpl("Kotlin")).randomDisplay();
    }

    @Test
    void textFileDisplay() {
        new Display(new TextFileDisplayImpl("D:\\git\\DesignPatterns\\demo08-AbstractFactory\\src\\main\\resources\\标题.html")).display();
    }

    @Test
    void decoratedStringDisplay() {
//        new Display(new DecoratedStringDisplayImpl('<', '$', '>')).display();
//        new CountDisplay(new DecoratedStringDisplayImpl('<', '$', '>')).multiDisplay(10);
//        new RepeatDisplay(new DecoratedStringDisplayImpl('<', '$', '>')).repeatDisplay(10);
        new RepeatCountDisplay(new DecoratedStringDisplayImpl('|', '#', '-')).repeatMultiDisplay(10);
    }
}
