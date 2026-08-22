package JL07_oops;

/*
 * this:
 * 1. Refers to the current object/current class.
 * 2. this.variable is used to refer to the current class's instance variable.
 * 3. this() is used to call another constructor of the same class.
 *
 * super:
 * 1. Refers to the immediate parent class.
 * 2. super(variable) is used to call the parent class constructor.
 * 3. super.variable is used to access a parent class variable.
 * 4. super.method() is used to call a parent class method.
 *
 * - this() and super() must be the FIRST statement in a constructor.
 * - this and super refer to the current object and its parent part respectively.
 */

class SuperClass {

    private int a;

    public SuperClass(int a) {

        // this.a refers to the instance variable of SuperClass.
        // a refers to the constructor parameter.
        this.a = a;

        System.out.println("This is Super Class And a = " + a);
    }
}


class SubClass extends SuperClass {

    private int b;

    public SubClass(int x, int y) {

        // super(x) calls the constructor of the immediate parent class.
        // Here it calls SuperClass(int a).
        super(x);

        // this.b refers to the instance variable of SubClass.
        // y refers to the constructor parameter.
        this.b = y;

        System.out.print("This is Sub Class And b = " + this.b);
    }
}


public class ThisAndSuper {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(10);
        SubClass subClass = new SubClass(8, 6);
    }
}