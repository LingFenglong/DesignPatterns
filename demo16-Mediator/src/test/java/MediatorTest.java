import frame.LoginFrame;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MediatorTest {
    @Test
    void mediatorTest() throws IOException {
        new LoginFrame("Mediator Sample Login");
        int read = System.in.read();
    }
}
