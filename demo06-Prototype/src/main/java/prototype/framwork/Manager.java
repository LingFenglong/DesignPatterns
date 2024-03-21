package prototype.framwork;

import java.util.HashMap;

public class Manager {
    private final HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String prototypeName) {
        return showcase.get(prototypeName).createClone();
    }

}
