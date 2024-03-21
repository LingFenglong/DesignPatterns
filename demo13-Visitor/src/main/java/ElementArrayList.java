import java.util.ArrayList;

public class ElementArrayList extends ArrayList<Element> implements Element {
    @Override
    public void accept(Visitor visitor) {
        this.forEach(element -> element.accept(visitor));
    }
}
