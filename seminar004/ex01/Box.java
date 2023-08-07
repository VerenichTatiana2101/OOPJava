import java.util.ArrayList;
import java.util.List;

public class Box {
    private List items = new ArrayList<>();

    public Box(List items) {
        this.items = items;
    }

    public List getItems() {
        return items;
    }

    public void addItems(Object item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return "Box{ " + "items =" + items + " }";
    }

    
}
