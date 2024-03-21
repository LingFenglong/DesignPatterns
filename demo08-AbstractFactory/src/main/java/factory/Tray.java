package factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList<Link> trays = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Link link) {
        trays.add(link);
    }
}
