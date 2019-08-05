import java.util.Collections;
import java.util.Iterator;

public abstract class Component {
    private String name;
    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public String getName() {
        return name;
    }

    // Default implementation for child management operations.
    public boolean add(Component child) { // fail by default
        return false;
    }

    public Iterator<Component> iterator() { // null iterator
        return Collections.<Component>emptyIterator();
    }
}