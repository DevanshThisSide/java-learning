package JL10_collections;

import java.util.Map;
import java.util.TreeMap;

/*
 *                         TREEMAP
 *
 * TreeMap is an implementation of the Map interface.
 * It stores data as KEY-VALUE pairs and maintains the keys in SORTED ORDER.

 * Example:
 *      put(30, "C")
 *      put(10, "A")
 *      put(20, "B")
 * TreeMap maintains:
 *      10 -> A
 *      20 -> B
 *      30 -> C

 * 1. Keys are unique.
 * 2. Values can be duplicated.
 * 3. Keys are maintained in sorted order.
 * 4. Sorting is based on natural ordering by default.
 * 5. TreeMap generally does not allow a null key.
 * 6. Null values are allowed.
 * 7. TreeMap is generally slower than HashMap for basic
 *    lookup because its operations take O(log n) time.
 *
 * TreeMap uses a self-balancing Red-Black Tree internally
 * to maintain sorted ordering efficiently.
 */

public class JCF_TreeMap {

    public static void main(String[] args) {

        // 1. Creating a TreeMap

        Map<Integer, String> students = new TreeMap<>();

        // 2. Adding entries
        // We intentionally insert the keys in an unsorted order.

        students.put(30, "Aman");
        students.put(10, "Devansh");
        students.put(20, "Rahul");
        students.put(40, "Karan");

        // TreeMap automatically maintains sorted key order.

        System.out.println("Students: " + students);

        // 3. Iterating through TreeMap
        // Entries are visited according to sorted key order.

        System.out.println("\n=== Iteration ===");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 4. Updating an existing key
        // Key 20 already exists, so its value is replaced.

        students.put(20, "Rohit");
        System.out.println("\nAfter updating key 20: " + students);

        // 5. Duplicate values
        // Different keys can have the same value.

        students.put(50, "Aman");
        System.out.println("After duplicate value: " + students);

        // 6. Getting a value

        System.out.println("Value for key 30: " + students.get(30));

        // 7. Checking whether a key exists

        System.out.println("Contains key 10: " + students.containsKey(10));

        // 8. Checking whether a value exists

        System.out.println("Contains value Aman: " + students.containsValue("Aman"));

        // 9. Null value
        // Null values are allowed.

        students.put(60, null);
        System.out.println("After adding null value: " + students);

        // 10. Null key
        // TreeMap generally does NOT allow null keys because
        // keys need to be compared for sorting.
        // The following would throw NullPointerException:
        // students.put(null, "Unknown");

        // 11. Removing an entry

        students.remove(60);

        System.out.println("After removing key 60: " + students);

        // 12. Size

        System.out.println("Map size: " + students.size());
    }
}

/*
                         Red-Black Tree

 * TreeMap internally uses a self-balancing Red-Black Tree.
 *
 * A normal BST can become unbalanced:
 * 10
    \
     20
       \
       30
         \
         40     --> This starts behaving almost like a linked list, making searching potentially O(n).

 * A Red-Black Tree prevents this by keeping the tree approximately balanced.
 *     20
      /  \
    10    30
            \
             40  --> This keeps operations around O(log n).

 * Each node is assigned either RED or BLACK color.
 * Specific coloring rules keep the tree approximately balanced.
 *
 * The important rules are:
        -> Every node is either red or black.
        -> The root is black.
        -> A red node cannot have a red child.
        -> Every path from a node to its descendant null leaves contains the same number of black nodes.

 * When required, the tree automatically performs rotations
 * and recoloring after insertions/deletions.
 *
 * This prevents the tree from becoming highly unbalanced
 * and keeps operations such as put(), get() and remove() generally at O(log n).
 *
 * We do NOT implement the Red-Black Tree ourselves;
 * TreeMap manages it internally.
 */