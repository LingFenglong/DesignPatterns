public class Trouble {
    private final int num;

    public Trouble(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }
}
