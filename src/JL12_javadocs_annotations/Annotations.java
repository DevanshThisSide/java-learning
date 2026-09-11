package JL12_javadocs_annotations;

/*
 * Annotation:
 * An annotation is metadata that provides additional information
 * about Java code to the compiler, JVM, tools, or frameworks.
 *
 * Annotation syntax:      @AnnotationName
 *
 * Example:      @Override
 *
 * An annotation normally does not perform an operation like a
 * normal method. Instead, it gives information about the code.
 *
 * ===================== COMMON BUILT-IN ANNOTATIONS =====================
 *
 * @Override
 *      Indicates that a method is intended to override a method
 *      from a superclass or implement a method from an interface.
 *
 * @Deprecated
 *      Marks a class, method, field, etc. as deprecated.
 *      Developers should avoid using the deprecated element.
 *
 * @SuppressWarnings
 *      Tells the compiler to suppress specified warnings.
 *
 * @FunctionalInterface -- used to ensure an interface is functional intreface.
 *      A functional interface in Java is an interface that contains only a single abstract
        (unimplemented) method.
*       A functional interface can contain default and static methods
         which do have an implementation, in addition to the single unimplemented method.

 * Annotation usage:      @Override
 *
 * Annotation declaration:
      @interface MyAnnotation {
 *      }
 *
 * @interface is used when creating our own custom annotation.
 *
 * ===================== ANNOTATIONS AND COMPILER =====================
 *
 * Some annotations allow the compiler to check whether our code
 * matches our intention.
 * For example, @Override allows the compiler to verify that a
 * method actually overrides a parent method.
 *
 * ===================== ANNOTATIONS AND FRAMEWORKS =====================
 *
 * Annotations are heavily used by Java frameworks.
 *
 * Examples that will be encountered later in Spring Boot:
 *      @RestController
 *      @Service
 *      @Autowired
 *      @GetMapping
 *      @PostMapping
 *
 * Frameworks can inspect annotations and use their information
 * to determine how the application should behave.

 * Annotations are metadata, not normal executable statements.
 * The actual behavior associated with an annotation depends on
 * the compiler, JVM, tool, or framework processing that annotation.
 */

//  Parent class used to demonstrate @Override.
class ParentClass {

    public void showMessage() {
        System.out.println("Message from ParentClass.");
    }
}


//  @Override tells the compiler that this method is intended
//  to override the showMessage() method of ParentClass.
class ChildClass extends ParentClass {

    @Override
    public void showMessage() {
        System.out.println("Message from ChildClass.");
    }
}

//  @Deprecated marks an element as old/deprecated.
//  When another class uses this method, the compiler/IDE can
//   warn the developer that the method should no longer be used.
class OldAPI {

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method.");
    }

    public void newMethod() {
        System.out.println("Use this method instead.");
    }
}

//  @FunctionalInterface indicates that this interface is intended to contain exactly ONE abstract method.
//  A functional interface can later be used with lambda expressions.
@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}

//  Main class for practicing built-in annotations.
public class Annotations {

    /*
     * @SuppressWarnings tells the compiler/IDE to suppress
     * the specified warning for this method.
     *
     * "deprecation" means warnings related to the use of
     * deprecated elements are suppressed here.
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        // @Override
        /*
         * ParentClass reference pointing to ChildClass object.
         * The overridden ChildClass method executes because of
         * runtime method dispatch / runtime polymorphism.
         */
        ParentClass parent = new ChildClass();
        parent.showMessage();

        // @Deprecated
        OldAPI oldAPI = new OldAPI();

        /*
         * oldMethod() is marked @Deprecated.
         * Normally the compiler/IDE gives a deprecation warning when this method is used.
         * @SuppressWarnings("deprecation") above main() suppresses that warning for this example.
         */
        oldAPI.oldMethod();

        // Recommended newer method.
        oldAPI.newMethod();

        // @FunctionalInterface
        /*
         * Calculator has exactly one abstract method:
         *      calculate(int a, int b)
         * We can implement it using an anonymous class.
         */
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Calculator Result : " + calculator.calculate(10, 20));
    }
}