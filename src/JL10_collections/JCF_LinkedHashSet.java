package JL10_collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

/*
 * ========================= LINKED HASHSET =========================
 * LinkedHashSet is a Set implementation that:
 * 1. Stores unique elements.
 * 2. Does not allow duplicate elements.
 * 3. Maintains insertion order.
 * 4. Allows one null element.
 * 5. Provides efficient basic operations such as add(), remove(), and contains().

 * LinkedHashSet belongs to:     java.util.LinkedHashSet

 * LinkedHashSet extends HashSet and additionally maintains insertion order.

 * HashSet:
 *      - Stores unique elements.
 *      - Does not guarantee insertion order.
 * LinkedHashSet:
 *      - Stores unique elements.
 *      - Maintains insertion order.

 * Because LinkedHashSet implements Set, duplicate elements are not stored.

 * Union:
 *      {10, 20, 30, 40}
 * Intersection:
 *      {20, 30}
 * Difference (set1 - set2):
        {10}

 * If an element is removed and then added again, it is treated
 * as a new insertion and appears at the end.
                    A → B → C
 * Remove B:        A → C
 * Add B again:     A → C → B

 *      HashSet       → No guaranteed order
 *      LinkedHashSet → Insertion order
 *      TreeSet       → Sorted order
 */
public class JCF_LinkedHashSet {

    public static void main(String[] args) {

        // 1. Creating a Linked HashSet
        /*
         * LinkedHashSet stores unique elements and maintains
         * insertion order.
         */
        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Languages : " + languages);

        // 2. Duplicate Elements
        /*
         * Duplicate values are ignored because LinkedHashSet
         * follows the Set interface.
         */
        boolean added = languages.add("Java");

        System.out.println("Was duplicate added? : " + added);
        System.out.println("Languages : " + languages);

        // 3. Checking an Element

        System.out.println("Contains Python? : " + languages.contains("Python"));

        System.out.println("Contains Ruby? : " + languages.contains("Ruby"));

        // 4. Removing an Element

        languages.remove("C++");

        System.out.println("After removing C++ : " + languages);

        // 5. Size

        System.out.println("Size : " + languages.size());

        // 6. Checking if Empty

        System.out.println("Is Empty? : " + languages.isEmpty());

        // 7. Iterating using Enhanced for Loop

        System.out.println("\nLanguages:");

        for (String language : languages) {
            System.out.println(language);
        }

        // 8. Iterating using Iterator

        /*
         * Iterator can be used to traverse a LinkedHashSet.
         */
        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language);
        }

        // 9. Set Operations

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        // Union

        LinkedHashSet<Integer> union = new LinkedHashSet<>(set1);

        union.addAll(set2);

        System.out.println("\nUnion : " + union);


        // Intersection

        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(set1);

        intersection.retainAll(set2);

        System.out.println("Intersection : " + intersection);

        // Difference

        LinkedHashSet<Integer> difference = new LinkedHashSet<>(set1);

        difference.removeAll(set2);

        System.out.println("Difference : " + difference);

        // containsAll()

        System.out.println("Set1 contains all Set2? : "
                + set1.containsAll(set2));

        // 10. Removing and Re-adding an Element

        LinkedHashSet<String> orderTest = new LinkedHashSet<>();

        orderTest.add("A");
        orderTest.add("B");
        orderTest.add("C");

        System.out.println("\nOriginal order : " + orderTest);

        orderTest.remove("B");
        orderTest.add("B");

        /*
         * B was removed and inserted again, so it appears
         * at the end of the insertion order.
         */
        System.out.println("After removing and adding B : " + orderTest);

        // 11. Clearing the Set

        orderTest.clear();

        System.out.println("After clear() : " + orderTest);
    }
}