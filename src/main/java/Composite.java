import java.util.*;

public class Composite extends Component {
private List<Component> children = new ArrayList<Component>();

      public Composite(String name) {
      super(name);
      }
public String operation() {
      Iterator<Component> it = children.iterator();
      String str = getName();
      Component child;
       while (it.hasNext()) {
        child = it.next();
        str += child.operation();
       }
      return str;
      }
 // Overriding the default implementation.
       @Override
 public boolean add(Component child) {
      return children.add(child);
      }
 @Override
 public Iterator<Component> iterator() {
      return children.iterator();
      }
 }