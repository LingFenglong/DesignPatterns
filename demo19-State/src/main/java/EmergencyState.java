public class EmergencyState extends State {
    private static final EmergencyState singleton = new EmergencyState();

    private EmergencyState() {
    }

    public static EmergencyState getInstance() {
        return singleton;
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("紧急按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("紧急正常通话");
    }

    @Override
    public String toString() {
        return "[紧急]";
    }
}
