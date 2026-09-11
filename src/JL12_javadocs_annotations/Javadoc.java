package JL12_javadocs_annotations;

/*
 * ===================== JAVADOC - CONCEPTS =====================
 *
 * Javadoc:
 * Javadoc is Java's documentation system used to generate
 * HTML documentation from specially formatted comments.
 *
 * Javadoc Comment:
 * Written using /** ... *\/ and placed before the class,
 * field, constructor, or method that needs documentation.
 *
 * Purpose of Javadoc:
 * - Makes code easier to understand and maintain.
 * - Documents how classes and methods should be used.
 * - Helps developers understand parameters, return values,
 *   and possible exceptions.
 * - Generates standard API documentation in HTML format.
 *
 * Javadoc vs Normal Comments:
 * //  and  /* ... *\/
 *      -> Normal comments ignored by the Javadoc tool.
 *
 * /** ... *\/
 *      -> Documentation comments processed by Javadoc.
 *
 * Javadoc Generation:
 * Java source code
 *       ↓
 * Javadoc comments
 *       ↓
 * javadoc command
 *       ↓
 * HTML documentation
 *
 * ===================== IMPORTANT JAVADOC TAGS =====================
 *
 * @author
 *      Specifies the author of the class or member.
 *
 * @version
 *      Specifies the version of the documented class or API.
 *
 * @since
 *      Specifies the version from which a class or feature exists.
 *
 * @param
 *      Describes a parameter accepted by a method or constructor.
 *
 * @return
 *      Describes the value returned by a method.
 *
 * @throws
 *      Documents an exception that a method may throw.
 *
 * @see
 *      Refers to another related Java class, method, or API.
 *
 * @deprecated
 *      Indicates through documentation that an API should no longer
 *      be used and can mention its recommended replacement.
 *
 * {@code ...}
 *      Formats the enclosed text as Java/code in the generated
 *      documentation.
 *
 * {@link ...}
 *      Creates a link to another documented Java element.
 *
 * ===================== INLINE JAVADOC TAGS =====================
 *
 * Block Tags:
 *      @author, @version, @param, @return, @throws, @see,
 *      @since, @deprecated
 *
 * Inline Tags:
 *      {@code ...}
 *      {@link ...}
 *
 * ===================== DEPRECATION =====================
 *
 * @deprecated
 *      Javadoc tag used to explain why an API should not be used.
 *
 * @Deprecated
 *      Java annotation that marks the actual code element as deprecated.
 *
 * They are different:
 *
 * @deprecated -> Documentation
 * @Deprecated -> Java annotation/compiler information
 *
 * ===================== PACKAGE DOCUMENTATION =====================
 *
 * A package can also have documentation using:
 *      package-info.java
 *
 * It is used to describe the purpose and contents of an entire package.
 *
 * ===================== JAVADOC TOOL =====================
 *
 * The 'javadoc' command reads source files and generates
 * HTML documentation from their Javadoc comments.
 *
 * Example:
 *      javadoc -d docs Javadoc.java
 *
 * -d docs
 *      Specifies the directory where generated documentation
 *      should be stored.
 */

/**
 * Demonstrates the major Javadoc documentation features used in Java.
 *
 * <p>
 * Javadoc comments are written using a special documentation comment
 * syntax and are processed by the {@code javadoc} tool to generate
 * HTML documentation.
 * </p>
 *
 * <p>
 * GitHub:
 * <a href="https://github.com/DevanshThisSide" target="_blank">
 * DevanshThisSide
 * </a>
 * </p>
 *
 * <p>
 * This class demonstrates documentation for fields, constructors and methods,
 * along with commonly used Javadoc tags such as {@code @param},
 * {@code @return}, {@code @throws}, {@code @see}, {@code @since}
 * and {@code @deprecated}.
 * </p>
 *
 * @author Devansh Bhatt
 * @version 1.0
 * @see Math
 * @since 2026
 */

public class Javadoc {

    /**
     * Stores the name of the student.
     *
     * <p>
     * This field is documented so that it can also appear
     * in the generated Javadoc documentation.
     * </p>
     */
    private String name;

    /**
     * Stores the age of the student.
     */
    private int age;

    /**
     * Creates a new {@code Javadoc} object.
     *
     * @param name name of the student
     * @param age  age of the student
     * @since 1.0
     */
    public Javadoc(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the student's name.
     *
     * @return student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Changes the student's name.
     *
     * @param name new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the student's age.
     *
     * @return student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Changes the student's age.
     *
     * @param age new age of the student
     * @throws IllegalArgumentException if the age is negative
     */
    public void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        this.age = age;
    }

    /**
     * Calculates the square of a number.
     *
     * <p>
     * {@code number * number} is used to calculate the square.
     * </p>
     *
     * @param number number whose square is required
     * @return square of the given number
     * @see Math#pow(double, double)
     */
    public int square(int number) {
        return number * number;
    }

    /**
     * Displays student information.
     *
     * <p>
     * The {@link #getName()} and {@link #getAge()} methods
     * are referenced using Javadoc links.
     * </p>
     */
    public void displayInfo() {

        System.out.println("Name : " + getName());
        System.out.println("Age  : " + getAge());
    }

    /**
     * This method demonstrates a deprecated method.
     *
     * @since 1.0
     * @deprecated Use {@link #displayInfo()} instead.
     */
    @Deprecated
    public void displayOldFormat() {

        System.out.println("Student : " + name + ", Age : " + age);
    }

    /**
     * Main method used to test the class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Javadoc student = new Javadoc("Devansh", 21);

        student.displayInfo();

        System.out.println("Square of 5 : " + student.square(5));

        /*
         * Calling a deprecated method intentionally for learning purposes.
         *
         * The compiler may display a deprecation warning.
         */
        student.displayOldFormat();
    }
}