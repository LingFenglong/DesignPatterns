public class DayState extends State {
    private static final DayState singleton = new DayState();

    private DayState() {
    }

    public static DayState getInstance() {
        return singleton;
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("白天使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("白天按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("白天正常通话");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
