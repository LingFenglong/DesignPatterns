import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TripleTest {
    @Test
    void tripleTest() {
        for (int i = 0; i < 3; i++) {
            Triple instance1 = Triple.getInstance(i);
            Triple instance2 = Triple.getInstance(i);

            Assertions.assertSame(instance1, instance2);
            Assertions.assertEquals(instance1.getInfo(), instance2.getInfo(), "第" + i + "个Triple");
        }
    }
}
