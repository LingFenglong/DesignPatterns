package display;

/**
 * Repeat：总体的重复
 * Count：内容的重复
 */
public class RepeatCountDisplay extends CountDisplay {

    public RepeatCountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void repeatMultiDisplay(int times) {
        for (int i = 0; i < times; i++) {
            multiDisplay(i);
        }
    }
}
