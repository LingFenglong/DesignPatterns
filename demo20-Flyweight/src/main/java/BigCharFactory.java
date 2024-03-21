import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BigCharFactory {
    private final Map<Character, BigChar> pool = new ConcurrentHashMap<>();
    private static final BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public BigChar getBidChar(char charName) {
        pool.computeIfAbsent(charName, BigChar::new);
        return pool.get(charName);
    }
}
