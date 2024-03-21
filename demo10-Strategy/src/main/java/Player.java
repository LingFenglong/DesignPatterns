public class Player {
    private final String name;
    private final Strategy strategy;
    private int winCount = 0;
    private int loseCount = 0;
    private int gameCount = 0;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return name + "  胜：" + winCount + "  败：" + loseCount + "  平：" + (gameCount - winCount - loseCount) + "  总：" + gameCount;
    }
}
