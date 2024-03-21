import java.util.ArrayList;
import java.util.List;

public class BigString {
    public final List<BigChar> bigChars = new ArrayList<>();
    private final BigCharFactory bigCharFactory = BigCharFactory.getInstance();

    public BigString(String string) {
        sharedConstructor(string);
    }

    public BigString(String string, boolean shared) {
        if (shared) {
            sharedConstructor(string);
        } else {
            noSharedConstructor(string);
        }
    }

    private void sharedConstructor(String string) {
        for (char ch : string.toCharArray()) {
            bigChars.add(bigCharFactory.getBidChar(ch));
        }
    }

    private void noSharedConstructor(String string) {
        for (char ch : string.toCharArray()) {
            bigChars.add(new BigChar(ch));
        }
    }

    public void print() {
        bigChars.forEach(BigChar::print);
    }
}
