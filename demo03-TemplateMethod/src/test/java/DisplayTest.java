import display.AbstractDisplay;
import display.CharDisplay;
import display.NumberDisplay;
import display.StringDisplay;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class DisplayTest {
    @Test
    void displayTest() {
        AbstractDisplay charDisplay = new CharDisplay('a');
        charDisplay.display();

        AbstractDisplay stringDisplay = new StringDisplay("Hello world!");
        stringDisplay.display();

        AbstractDisplay helloStringDisplay = new StringDisplay("你好 世界！");
        helloStringDisplay.display();

        AbstractDisplay numberDisplay = new NumberDisplay(BigDecimal.valueOf(3.1415926789654123));
        numberDisplay.display();
    }
}
