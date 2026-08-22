package JL07_oops;

/*
 * 1. Method overriding occurs when a child class provides its own
 *    implementation of a method already defined in the parent class.
 *
 * 2. The method in the child class must have the same:
 *    - method name
 *    - parameters
 *    - compatible return type
 *
 * 3. Method overriding is an important part of Runtime Polymorphism.
 */

class A {

    public void methodA() {
        System.out.println("This is methodA of Class A.");
    }
}


class B extends A {
    @Override   // @Override is an annotation that tells Java that we intend
                // to override a parent class method.
    //    methodA() is overridden.
    public void methodA() {
        System.out.println("This is methodA of Class B.");
    }

    public void methodB() {
        System.out.print("This is methodB of Class B.");
    }
}


public class MethodOverriding {

    public static void main(String[] args) {
        A a = new A();
        a.methodA();

        B b = new B();
        b.methodA();

        b.methodB();
    }
}
/*
  METHOD OVERLOADING vs METHOD OVERRIDING
  Overloading:
  - Same method/constructor name with different parameters.
  - Compile-time polymorphism.
  - Inheritance is not required.
  Overriding:
  - Child class provides a new implementation of a method inherited from the parent class.
  - Same method signature.
  - Requires inheritance.
  - Runtime polymorphism.
  Memory:
  Overloading  -> Same name, different parameters.
  Overriding   -> Same method, different implementation.
 */