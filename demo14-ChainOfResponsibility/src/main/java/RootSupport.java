public class RootSupport extends Support {
    public RootSupport(String name) {
        super(name);
    }

    public RootSupport() {
        super("Root Support");
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
