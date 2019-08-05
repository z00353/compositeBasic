public class Client {
    // Running the Client class as application.
    public static void main(String[] args) {
        // Building a tree structure.
        Component composite2 = new Composite("composite2 ");
        composite2.add(new Leaf("leaf3 "));
        composite2.add(new Leaf("leaf4 "));
        composite2.add(new Leaf("leaf5 "));
        Component composite1 = new Composite("composite1 ");
        composite1.add(new Leaf("leaf1 "));
        composite1.add(composite2);
        composite1.add(new Leaf("leaf2 "));

        // Performing an operation on composite1
        // (walking down the entire hierarchy).
        System.out.println("(1) " + composite1.operation());

        // Performing an operation on composite2
        //(walking down the subtree).
        System.out.println("(2) " + composite2.operation());

    }
}