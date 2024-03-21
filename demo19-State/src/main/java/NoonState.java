public class NoonState extends State {
    private static final NoonState singleton = new NoonState();

    private NoonState() {
    }

    public static NoonState getInstance() {
        return singleton;
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("中午使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("中午按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("中午正常通话");
    }

    @Override
    public String toString() {
        return "[中午]";
    }
}
