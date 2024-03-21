import java.util.Random;

public class ProbStrategy implements Strategy {
    private final Random random;
    private int preHandValue = 0;
    private int curHandValue = 0;
    private final int[][] history = {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 }
    };
    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(curHandValue));
        int handValue;
        if (bet < history[curHandValue][0]) {
            handValue = 0;
        } else if (bet < history[curHandValue][0] + history[curHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }

        preHandValue = curHandValue;
        curHandValue = handValue;
        return Hand.getHand(handValue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[preHandValue][curHandValue]++;
        } else {
            history[preHandValue][(curHandValue + 1) % 3]++;
            history[preHandValue][(curHandValue + 2) % 3]++;
        }
    }
}
