import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {
    @Test
    void singletonTest() {
        SynchronizedSingleton synchronizedSingleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton2 = SynchronizedSingleton.getInstance();

        assertSame(synchronizedSingleton1, synchronizedSingleton2);
    }

    @Test
    void staticSingletonTest() {
        StaticSingleton staticSingleton1 = StaticSingleton.getInstance();
        StaticSingleton staticSingleton2 = StaticSingleton.getInstance();

        assertSame(staticSingleton1, staticSingleton2);
    }

    @Test
    void enumSingletonTest() {
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();

        assertSame(enumSingleton1, enumSingleton2);
    }

    @Test
    void innerClassSingletonTest() {
        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();

        assertSame(innerClassSingleton1, innerClassSingleton2);
    }
}
