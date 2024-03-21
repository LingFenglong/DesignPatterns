import org.junit.jupiter.api.Test;

import java.util.Random;

public class HandTest {
    @Test
    void handTest() {
        Random random = new Random();
//        Player player1 = new Player("AAA", new WinningStrategy(random.nextInt()));
//        Player player2 = new Player("BBB", new ProbStrategy(random.nextInt()));
//        Player player1 = new Player("AAA", new SingleStrategy(2));
//        Player player2 = new Player("BBB", new SingleStrategy(1));
        Player player1 = new Player("AAA", new SingleStrategy(0));
        Player player2 = new Player("BBB", new WinningStrategy(random.nextInt()));

        for (int i = 0; i < 100000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            if (hand1.isStrongerThan(hand2)) {
                player1.win();
                player2.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                player1.lose();
                player2.win();
            } else {
                player1.even();
                player2.even();
            }

            System.out.println((i + 1) + " - hand1: " + hand1 + "  hand2: " + hand2);
        }

        System.out.println(player1);
        System.out.println(player2);
    }
}
