public class Hand {
    // 石头
    public static final int HAND_VALUE_GUU = 0;
    // 剪刀
    public static final int HAND_VALUE_CHO = 1;
    // 布
    public static final int HAND_VALUE_PAA = 2;

    private static final Hand[] hands = new Hand[] {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA),
    };
    private static final String[] name = new String[] { "石头", "剪刀", "布" };
    private final int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
