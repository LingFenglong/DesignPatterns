import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    void observerTest() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        DigitObserver digitObserver = new DigitObserver();
        GraphObserver graphObserver = new GraphObserver();

        randomNumberGenerator.addObserver(digitObserver);
        randomNumberGenerator.addObserver(graphObserver);

        randomNumberGenerator.execute();
    }

    @Test
    void IncrementalNumberGenerateTest() {
        IncrementalNumberGenerate incrementalNumberGenerate = new IncrementalNumberGenerate(10, 50, 5);
        DigitObserver digitObserver = new DigitObserver();
        GraphObserver graphObserver = new GraphObserver();
        HahaObserver hahaObserver = new HahaObserver();

        incrementalNumberGenerate.addObserver(digitObserver);
        incrementalNumberGenerate.addObserver(graphObserver);
        incrementalNumberGenerate.addObserver(hahaObserver);
        incrementalNumberGenerate.execute();
    }
}
