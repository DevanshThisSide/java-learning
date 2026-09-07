package JL10_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *              COMPARABLE AND COMPARATOR

 * Comparable:
 * - Used to define the NATURAL ORDERING
 * (The default, inherent way to sort a specific type of object) of a class.
 * - Implemented by the class whose objects are being sorted.
 * - Uses compareTo().

 * Comparator:
 * - Used to define CUSTOM / ALTERNATIVE ordering.
 * (An alternative or ad-hoc way to sort objects based on specific requirements.)
 * - Usually written separately from the class being sorted.
 * - Uses compare().
 * compareTo() / compare() result:
 *
 * Negative     -> first object comes before second
 * Zero         -> objects are considered equal for ordering
 * Positive     -> first object comes after second
 */

/*
 *                   COMPARABLE STUDENT

 * Comparable is implemented here because we want this class
 * to have a NATURAL ORDERING.

 * In this example:
      Natural ordering = ID
 */

class ComparableStudent implements Comparable<ComparableStudent> {

    int id;
    String name;
    int age;

    public ComparableStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Comparable implementation
    // Defines the natural ordering.
    // Smaller ID comes first.

    @Override
    public int compareTo(ComparableStudent other) {

        return Integer.compare(this.id, other.id);
        // Can also be return Integer.compare(s1.id, s2.id);
        // but can cause integer overflow when values are very large.
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age;
    }
}

/*
 *                     AGE COMPARATOR
 *
 * Comparator is used when we want an ordering different from the natural ordering.

 * Here:
       Custom ordering = Age
 */

class AgeComparator implements Comparator<ComparableStudent> {

    @Override
    public int compare(ComparableStudent s1, ComparableStudent s2) {

        return Integer.compare(s1.age, s2.age);
        // Can also be return s1.age - s2.age;
        // but can cause integer overflow when values are very large.
    }
}

/*
 *                     NAME COMPARATOR

 * Another Comparator can provide another custom ordering.

 * Here:
      Custom ordering = Name
 */

class NameComparator implements Comparator<ComparableStudent> {

    @Override
    public int compare(ComparableStudent s1, ComparableStudent s2) {

        return s1.name.compareTo(s2.name); // This is the safer approach for Strings
    }
}

public class JCF_ComparableComparator {

    public static void main(String[] args) {

        // Creating a list of ComparableStudent objects

        List<ComparableStudent> students = new ArrayList<>();

        students.add(new ComparableStudent(103, "Aman", 19));
        students.add(new ComparableStudent(101, "Devansh", 21));
        students.add(new ComparableStudent(102, "Rahul", 20));


        // 1. Natural ordering using Comparable
        // ComparableStudent implements Comparable.
        // compareTo() defines the natural ordering by ID.

        Collections.sort(students); // Can also use List.sort(list)

        System.out.println("=== Natural Order (ID) ===");

        for (ComparableStudent student : students) {
            System.out.println(student);
        }

        // 2. Custom ordering using Comparator
        // Now we want to sort the SAME objects according to their age.

        Collections.sort(students, new AgeComparator()); // Can also use List.sort(list , comaprator)

        System.out.println("\n=== Custom Order (Age) ===");

        for (ComparableStudent student : students) {
            System.out.println(student);
        }

        // 3. Another custom ordering
        // Sort the same objects according to their names.

        Collections.sort(students, new NameComparator()); // Can also use List.sort(list , comaprator)

        System.out.println("\n=== Custom Order (Name) ===");

        for (ComparableStudent student : students) {
            System.out.println(student);
        }
    }
}