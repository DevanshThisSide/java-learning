package JL10_collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 *                    LINKED HASHMAP
 *
 * LinkedHashMap is a Map implementation that combines:   Hashing    +    Linked ordering
 * It maintains insertion order by default.

 * 1. Stores data as key-value pairs.
 * 2. Keys are unique.
 * 3. Values can be duplicated.
 * 4. Maintains insertion order during iteration.
 * 5. Allows one null key.
 * 6. Allows multiple null values.
 * 7. Provides generally O(1) average-time lookup for operations such as get(), put() and remove().

 * HashMap          -> No guaranteed iteration order
 * LinkedHashMap    -> Maintains insertion order

 * By default, LinkedHashMap uses insertion-order mode.

 * It also supports access-order mode, where entries can be
 * reordered based on access. This is useful in concepts such
 * as LRU (Least Recently Used) caches.
 */

public class JCF_LinkedHashMap {

    public static void main(String[] args) {

        // 1. Creating a LinkedHashMap

        Map<Integer, String> students = new LinkedHashMap<>();

        // 2. Adding entries
        // The insertion order is:
        // 101 → 103 → 102

        students.put(101, "Devansh");
        students.put(103, "Aman");
        students.put(102, "Rahul");
        System.out.println("Students: " + students);

        // 3. Iteration follows insertion order

        System.out.println("\n=== Iteration ===");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 4. Updating an existing key
        // Key 101 already exists.
        // Its value is replaced.
        // The entry keeps its existing position.

        students.put(101, "Rohit");
        System.out.println("\nAfter updating key 101: " + students);

        // 5. Adding a new entry
        // A new key is added at the end of the insertion order.

        students.put(104, "Karan");
        System.out.println("After adding key 104: " + students);

        // 6. Duplicate values are allowed

        students.put(105, "Aman");

        System.out.println("After duplicate value: " + students);

        // 7. Null key
        // LinkedHashMap allows one null key.

        students.put(null, "Unknown");
        System.out.println("After null key: " + students);


        // 8. Null values
        // Multiple null values are allowed.

        students.put(106, null);
        students.put(107, null);
        System.out.println("After null values: " + students);

        // 9. Getting a value

        System.out.println("\nValue for key 103: " + students.get(103));

        // 10. Removing an entry

        students.remove(107);
        System.out.println("After removing key 107: " + students);

        // 11. Checking whether a key exists

        System.out.println("Contains key 104: " + students.containsKey(104));

        // 12. Checking size

        System.out.println("Map size: " + students.size());

        /*
         *                 ACCESS-ORDER LINKED HASHMAP
         *
         * By default, LinkedHashMap maintains INSERTION ORDER.
         *
         *      new LinkedHashMap<>()
         *              ↓
         *       Insertion order
         *
         * LinkedHashMap can also be configured to maintain
         * ACCESS ORDER using this constructor:    new LinkedHashMap<>(16, 0.75f, true);
         *
         * Parameters:
         *      16       -> Initial capacity
         *      0.75f    -> Load factor (when to resize)
         *      true     -> Enables access-order
         *
         * In access-order mode, accessing an existing entry using
         * operations such as get() moves that entry toward the end.
         *
         * Example:
         *      A → B → C
         * If done      map.get(A);
         * Then maintained order      B → C → A  (Because A was just accessed.)
         * A is now the most recently accessed entry.
         * This behavior is useful for implementing an LRU (Least Recently Used) cache.
         */

        LinkedHashMap<Integer, String> accessMap =
                new LinkedHashMap<>(16, 0.75f, true);
                // true specifically means:
                //Maintain access order instead of insertion order.

        accessMap.put(1, "A");
        accessMap.put(2, "B");
        accessMap.put(3, "C");

        System.out.println("Before Access Key 1 : " + accessMap); // {1=A, 2=B, 3=C}
        accessMap.get(1);
        System.out.println("After Access Key 1 : " + accessMap); // {2=B, 3=C, 1=A}
    }
}