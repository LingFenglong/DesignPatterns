import org.junit.jupiter.api.Test;

public class StateTest {
    @Test
    void stateTest() {
        SafeContext safeContext = new SafeContext();    // default is DayState
        safeContext.doUse();
        safeContext.doAlarm();
        safeContext.doPhone();

        System.out.println();
        safeContext.setClock(23); // 23:00
        safeContext.doUse();
        safeContext.doAlarm();
        safeContext.doPhone();

        System.out.println();
        System.out.println("按下紧急按钮！！！");
        safeContext.emergencyButton();
        safeContext.doUse();
        safeContext.doAlarm();
        safeContext.doPhone();

        System.out.println();
        safeContext.setClock(13); // 12:00
        safeContext.doUse();
        safeContext.doAlarm();
        safeContext.doPhone();

        System.out.println();
        System.out.println("危机解除了，再次按下紧急按钮。。。");
        safeContext.emergencyButton();
        safeContext.setClock(12); // 12:00
        safeContext.doUse();
        safeContext.doAlarm();
        safeContext.doPhone();
    }
}
