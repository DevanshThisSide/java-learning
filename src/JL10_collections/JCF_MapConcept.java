package JL10_collections;

import java.util.HashMap;
import java.util.Map;

/*
 *                    MAP CONCEPT
 *
 * Map is a part of the Java Collections Framework used to store data in KEY-VALUE pairs.
 *
 * Key:
 * - Used to identify a value.
 * - Keys must be unique.
 * Value:
 * - Data associated with a key.
 * - Values can be duplicated.

 * Map is part of the Collections Framework, but Map does NOT extend the Collection interface.

 * Common Map implementations:
 *
 * HashMap               -> No guaranteed ordering
 * LinkedHashMap         -> Maintains insertion order
 * TreeMap               -> Maintains sorted order of keys

 * Important Map methods:
 *
 * put(key, value)       -> adds or updates a key-value pair
 * get(key)              -> returns the value associated with the key
 * remove(key)           -> removes the mapping for the key
 * containsKey(key)      -> checks whether a key exists
 * containsValue(value)  -> checks whether a value exists
 * size()                -> returns number of key-value mappings
 * isEmpty()             -> checks whether the Map contains no mappings
 * keySet()              -> returns all keys as a Set
 * values()              -> returns all values
 * entrySet()            -> returns all key-value mappings

 * Map.Entry represents one key-value pair inside a Map.
 *      key       +     value   ->   Map.Entry

 * If an existing key is used with put(), its old value is replaced by the new value.
 */

public class JCF_MapConcept {

    public static void main(String[] args) {

        // 1. Creating a Map
        // Map is an interface, so we create an object of one of its implementations.
        // HashMap is used here.

        Map<Integer, String> students = new HashMap<>();

        // 2. Adding key-value pairs using put()

        students.put(101, "Devansh");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        System.out.println("Students: " + students);

        // 3. Keys must be unique
        // Key 101 already exists.
        // Therefore, the old value "Devansh" is replaced.

        students.put(101, "Rohit");
        System.out.println("After updating key 101: " + students);

        // 4. Values can be duplicated
        // Different keys can have the same value.

        students.put(104, "Aman");
        System.out.println("Duplicate value allowed: " + students);

        // 5. Getting a value using get()
        String studentName = students.get(102);
        System.out.println("Value for key 102: " + studentName);

        // 6. Checking whether a key exists

        System.out.println("Contains key 103: " + students.containsKey(103));
        System.out.println("Contains key 999: " + students.containsKey(999));

        // 7. Checking whether a value exists

        System.out.println("Contains value Aman: " + students.containsValue("Aman"));

        // 8. Map size

        System.out.println("Map size: " + students.size());

        // 9. Removing a mapping

        students.remove(104);
        System.out.println("After removing key 104: " + students);

        // 10. Getting all keys
        // keySet() returns the keys as a Set.

        System.out.println("\nKeys: " + students.keySet());

        // 11. Getting all values

        System.out.println("Values: " + students.values());

        // 12. Getting key-value entries
        // entrySet() returns each mapping as a Map.Entry.
        // Each individual mapping is represented by:
        //Map.Entry<Integer, String> and you can access its two parts using:
        //entry.getKey()
        //entry.getValue()

        System.out.println("\nEntries:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }

        // 13. Checking whether Map is empty

        System.out.println("\nIs Map empty: " + students.isEmpty());
    }
}