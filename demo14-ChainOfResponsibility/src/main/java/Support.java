public abstract class Support {
    private final String name;
    private Support next;

    protected Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);
    protected void done (Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this);
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved by " + this);
    }

    public Support getNext() {
        return next;
    }
}