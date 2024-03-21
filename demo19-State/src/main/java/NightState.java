public class NightState extends State {
    private static final NightState singleton = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return singleton;
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("晚上按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上正常通话");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
