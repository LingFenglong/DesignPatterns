public class IncrementalNumberGenerate extends NumberGenerator {
    private int start;
    private int end;
    private int step;
    private int number;

    public IncrementalNumberGenerate(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (start < end) {
            number = start;
            start += step;
            notifyObservers();
        }
    }
}
