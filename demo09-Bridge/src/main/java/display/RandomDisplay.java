package display;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void randomDisplay() {
//        super.multiDisplay(RandomGeneratorFactory.getDefault().create().nextInt(1, 11));
        super.multiDisplay(new Random().nextInt(1, 11));
    }
}
