import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class SupportTest {
    @Test
    void supportTest() {
        RootSupport rootSupport = new RootSupport();
        NoSupport noSupport = new NoSupport("No Support");
        OddSupport oddSupport = new OddSupport("Odd Support");
        SpecialSupport specialSupport = new SpecialSupport("Special Support", 1);
        LimitSupport limitSupport = new LimitSupport("Limit Support", 5);
        rootSupport
                .setNext(noSupport)
                .setNext(oddSupport)
                .setNext(specialSupport)
                .setNext(limitSupport);

        IntStream.range(1, 501).forEach(i -> rootSupport.support(new Trouble(i)));

//        1 <-----> 2
        Support temp = rootSupport.getNext();
        rootSupport.setNext(temp.getNext());
        rootSupport.getNext().setNext(temp);
    }

    @Test
    void supportsArrayListTest() {
        NoSupport noSupport = new NoSupport("No Support");
        OddSupport oddSupport = new OddSupport("Odd Support");
        SpecialSupport specialSupport = new SpecialSupport("Special Support", 1);
        LimitSupport limitSupport = new LimitSupport("Limit Support", 5);

        Supports supports = new Supports();
        supports.add(noSupport);
        supports.add(oddSupport);
        supports.add(specialSupport);
        supports.add(limitSupport);
        IntStream.range(1, 501).forEach(i -> supports.support(new Trouble(i)));
    }
}
