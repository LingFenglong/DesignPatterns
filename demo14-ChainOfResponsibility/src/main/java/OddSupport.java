public class OddSupport extends Support {

    protected OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNum() % 2 == 1;
    }
}
