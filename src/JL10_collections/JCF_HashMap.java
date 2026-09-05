package JL10_collections;

import java.util.HashMap;
import java.util.Map;

/*
 *                       HASHMAP
 *
 * HashMap is an implementation of the Map interface.
 * It stores data in KEY-VALUE pairs:

 * 1. Keys are unique.
 * 2. Values can be duplicated.
 * 3. HashMap does not guarantee any particular ordering.
 * 4. HashMap allows one null key.
 * 5. HashMap allows multiple null values.
 * 6. HashMap uses hashing internally to locate entries.

 * Common operations such as:   put()   get()   remove()   containsKey()
 * generally have O(1) average-time complexity.
 *
 * Basic hashing idea:
 *      Key
 *       ↓
 *    hashCode()
 *       ↓
 *     Hash value
 *       ↓
 *     Bucket
 *       ↓
 *   Key + Value
 *
 * A collision occurs when different keys are mapped to the
 * same bucket. Java handles such collisions internally.
 *
 * HashMap is useful when:
 *      We want fast lookup using a key
 *      and ordering is not important.
 */

public class JCF_HashMap {

    public static void main(String[] args) {

        // 1. Creating a HashMap
        // Map is the reference type and HashMap is the implementation.

        Map<Integer, String> students = new HashMap<>();

        // 2. Adding key-value pairs

        students.put(101, "Devansh");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        System.out.println("Students: " + students);

        // 3. Duplicate keys
        // Key 101 already exists.
        // The old value is replaced.

        students.put(101, "Rohit");
        System.out.println("After updating key 101: " + students);

        // 4. Duplicate values
        // Different keys can have the same value.

        students.put(104, "Aman");
        System.out.println("After duplicate value: " + students);

        // 5. Getting a value

        System.out.println("Student with key 102: " + students.get(102));

        // 6. Searching using containsKey()

        System.out.println("Contains key 103: " + students.containsKey(103));
        System.out.println("Contains key 999: " + students.containsKey(999));

        // 7. Searching using containsValue()

        System.out.println("Contains value Aman: " + students.containsValue("Aman"));

        // 8. Null key
        // HashMap allows one null key.

        students.put(null, "Unknown");
        System.out.println("After adding null key: " + students);

        // 9. Null value
        // Multiple keys can have null values.

        students.put(105, null);
        students.put(106, null);
        System.out.println("After adding null values: " + students);

        // 10. Removing an entry

        students.remove(106);
        System.out.println("After removing key 106: " + students);

        // 11. Iterating through the HashMap
        // entrySet() gives us each key-value mapping.

        System.out.println("\n=== Entries ===");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 12. Checking size

        System.out.println("\nSize: " + students.size());

        // 13. Demonstrating that ordering is not guaranteed
        // HashMap should not be used when we need insertion order or sorted order.
        // LinkedHashMap and TreeMap are designed for those requirements.

        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(3, "Three");
        numbers.put(1, "One");
        numbers.put(5, "Five");
        numbers.put(2, "Two");
        numbers.put(4, "Four");
        System.out.println("\nHashMap ordering: " + numbers);

        // 14. Final lookup example
        // HashMap is especially useful when we frequently need to find a value using its key.

        System.out.println("Value for key 3: " + numbers.get(3));
    }
}