package JL07_oops;

// A child constructor calls a constructor of its parent using super().
// super() must be the first statement inside a constructor.
// If super(...) is not written, Java automatically calls the no-argument constructor of the parent class.
// Parent constructor executes before the child constructor body.
// Constructor overloading can be used in parent and child classes.
// The constructor call chain always moves from the top-level parent toward the child.

class Parent {

    public Parent() {
        System.out.println("I am the Parent Constructor.");
    }

    // Overloaded constructor of the Parent class.
    public Parent(int x) {
        System.out.println("I am the Overloaded Constructor of Parent Class where x = " + x);
    }
}

// ChildOfParent inherits from Parent.
class ChildOfParent extends Parent {

    public ChildOfParent() {

        // Calls the overloaded constructor of the immediate parent class.
        super(0);

        System.out.println("I am the Parent's Child Constructor.");
    }

    // Overloaded constructor of the child class.
    public ChildOfParent(int x, int y) {

        // Calls Parent's parameterized constructor.
        super(x);

        System.out.println("I am the Overloaded Constructor of Parent's Child Class where x = "
                + x + ", y = " + y);
    }
}

// ChildOfParentChild inherits from ChildOfParent.
// This creates multilevel inheritance.
class ChildOfParentChild extends ChildOfParent {

    public ChildOfParentChild() {

        // Calls the parameterized constructor of the immediate parent.
        super(0, 0);

        System.out.println("I am the Parent's Child's Child Constructor.");
    }

    // Overloaded constructor of the third-level child class.
    public ChildOfParentChild(int x, int y, int z) {

        // Calls ChildOfParent's parameterized constructor.
        super(x, y);

        System.out.println("I am the Overloaded Constructor of Parent's Child's Child Class where x = "
                + x + ", y = " + y + ", z = " + z);
    }
}

public class InheritanceInConstructors {

    public static void main(String[] args) {
        // Parent parent = new Parent();
        // Parent parent1 = new Parent(12);
        // ChildOfParent childOfParent = new ChildOfParent();
        // ChildOfParent childOfParent1 = new ChildOfParent(10, 8);
        // ChildOfParentChild childOfParentChild = new ChildOfParentChild();
        ChildOfParentChild childOfParentChild1 = new ChildOfParentChild(6, 4, 2);
    }
}