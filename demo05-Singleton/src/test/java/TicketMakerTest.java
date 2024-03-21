import org.junit.jupiter.api.Test;

public class TicketMakerTest {
    @Test
    void ticketMakerTest() {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        for (int i = 0; i < 100; i++) {
            System.out.println(ticketMaker1.getNextTicketNumber());
        }

        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        for (int i = 0; i < 100; i++) {
            System.out.println(ticketMaker2.getNextTicketNumber());
        }
    }
}
