import java.util.ArrayList;

public class Supports extends ArrayList<Support> {
    public void support(Trouble trouble) {
        boolean resolved = false;
        for (Support support : this) {
            if (support.resolve(trouble)) {
                done(support, trouble);
                resolved = true;
                break;
            }
        }

        if (!resolved) {
            fail(trouble);
        }
    }

    protected void done (Support support, Trouble trouble) {
        System.out.println(trouble + " is resolved by " + support);
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }
}