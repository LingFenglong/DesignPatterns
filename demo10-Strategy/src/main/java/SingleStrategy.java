public class SingleStrategy implements Strategy {
    private final Hand singleHand;

    public SingleStrategy(int handValue) {
        this.singleHand = Hand.getHand(handValue);
    }

    @Override
    public Hand nextHand() {
        return singleHand;
    }

    @Override
    public void study(boolean win) {

    }
}
