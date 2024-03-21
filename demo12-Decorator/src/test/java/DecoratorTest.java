import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    void decoratorTest() {
//        StringDisplay stringDisplay = new StringDisplay("Hello world!");
        MultiStringDisplay multiStringDisplay = new MultiStringDisplay();
        multiStringDisplay.add("Hello world!");
        multiStringDisplay.add("Hello!");
        multiStringDisplay.add("Hi!");

//        SideBorder display = new SideBorder(new FullBorder(new FullBorder(new FullBorder(new FullBorder(new FullBorder(new FullBorder(new FullBorder(stringDisplay))))))), '$');
//        FullBorder display = new FullBorder(stringDisplay);
//        Display display = new UpDownBorder(
//                new FullBorder(
//                        new FullBorder(
//                                new FullBorder(
//                                        new FullBorder(
//                                                new FullBorder(
//                                                        new FullBorder(
//                                                                new FullBorder(multiStringDisplay)
//                                                        )
//                                                )
//                                        )
//                                )
//                        )
//                )
//        );
//        Display display = new SideBorder(new UpDownBorder(multiStringDisplay), '$');
        Display display = new UpDownBorder(new SideBorder(multiStringDisplay, '$'));
        display.show();
    }
}
