public class SafeContext implements Context, Mediator {
    private int clock;
    private boolean emergency = false;
    private State state = DayState.getInstance();

    @Override
    public void setClock(int hour) {
        System.out.println("时间从" + this.clock + "改变到了" + hour);
        this.clock = hour;
        stateChanged();
    }

    public void emergencyButton() {
        emergency = !emergency;
        stateChanged();
    }

    @Override
    public void changeState(State state) {
        System.out.println("状态从" + this.state + "改变到了" + state);
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String message) {
        System.out.println("给安全中心打电话：" + message);
    }

    @Override
    public void recordLog(String message) {
        System.out.println("记录事件：" + message);
    }

    public void doUse() {
        state.doUse(this);
    }

    public void doAlarm() {
        state.doAlarm(this);
    }

    public void doPhone() {
        state.doPhone(this);
    }

    @Override
    public void stateChanged() {
        if (emergency) {
            state = EmergencyState.getInstance();
        } else {
            timeStateChanged();
        }
    }

    private void timeStateChanged() {
        if ((8 <= clock && clock < 12) || (13 <= clock && clock < 21)) {
            // 白天
            state = DayState.getInstance();
        } else if (12 <= clock && clock < 13) {
            // 中午
            state = NoonState.getInstance();
        } else if (21 <= clock || clock < 8) {
            // 晚上
            state = NightState.getInstance();
        }
    }
}
