package JL10_collections;

import java.util.TreeSet;

/*
 * TreeSet is a Set implementation used to store UNIQUE elements in SORTED ORDER.
 * It belongs to:      java.util.TreeSet
 * 1. Stores unique elements.
 * 2. Does not allow duplicate elements.
 * 3. Maintains elements in sorted order.
 * 4. Implements the NavigableSet interface.
 * 5. Provides methods for navigating through sorted elements.
 *      Set
 *       |
 *       +---------------- HashSet
 *       |
 *       +---------------- LinkedHashSet
 *       |
 *       +---------------- SortedSet
 *                        |
 *                        +---- NavigableSet
 *                               |
 *                               +---- TreeSet
 * The TreeSet maintains the ordering as elements are inserted, not first insert all and then sort
 *
 * HashSet:
 *      Unique elements
 *      No guaranteed ordering
 * LinkedHashSet:
 *      Unique elements
 *      Insertion order
 * TreeSet:
 *      Unique elements
 *      Sorted order
 *
 * ========================= BASIC EXAMPLE =========================
 *
 *      TreeSet<Integer> numbers = new TreeSet<>();
 *      numbers.add(40);
 *      numbers.add(10);
 *      numbers.add(30);
 *      numbers.add(20);
 * Result:      [10, 20, 30, 40]
 * The elements are automatically sorted.

 * Like other Set implementations, TreeSet does not store duplicates.
 *
 *      numbers.add(20);
 *      numbers.add(20);
 * The second 20 is ignored.
 * add() returns:
 *      true  -> element was added
 *      false -> element was already present

 * TreeSet uses the natural ordering of elements by default.
 * Examples:
 * Integer:      10, 20, 30, 40
 * String:      Apple, Banana, Mango
 *
 * For custom objects, ordering can be provided using Comparable
 * or Comparator. These concepts will be covered separately later.

 * ========================= SORTED-SET METHODS =========================
 *
 * first()      Returns the smallest element.
 *
 * last()      Returns the largest element.

 * ========================= NAVIGATION METHODS (Navigational Operations) =========================
 *
 * lower(element)
 *      Returns the greatest element strictly smaller than the given element.
 * floor(element)
 *      Returns the greatest element less than or equal to the given element.
 * higher(element)
 *      Returns the smallest element strictly greater than the given element.
 * ceiling(element)
 *      Returns the smallest element greater than or equal to the given element.
 * Example:
 *      TreeSet<Integer> numbers = [10, 20, 30, 40]
 *      lower(30)   <            -> 20
 *      floor(30)   <=           -> 30
 *      higher(30)  >            -> 40
 *      ceiling(30) >=          -> 30

 * ========================= POLLING METHODS (Removing boundary elements) =========================
 *
 * pollFirst()
 *      Returns and removes the smallest element.
 * pollLast()
 *      Returns and removes the largest element.

 * ========================= RANGE VIEWS =========================
 *
 * headSet(element)
 *      Returns all elements smaller than the specified element.
 * tailSet(element)
 *      Returns all elements greater than or equal to the specified element.
 * subSet(from, to)
 *      Returns all elements from the specified range ("to" value exclusive).
 * Example:
 *      numbers = [10, 20, 30, 40, 50]
 *      headSet(30)          -> [10, 20]
 *      tailSet(30)          -> [30, 40, 50]
 *      subSet(20, 50)       -> [20, 30, 40]
 *
 * ========================= DESCENDING ORDER =========================
 *
 * descendingSet()
 *      Returns a view of the elements in reverse order.
 *      [10, 20, 30, 40]        becomes:      [40, 30, 20, 10]
 *
 * ========================= NULL =========================
 *
 * TreeSet generally does NOT allow null elements when natural ordering (Sorting with primitive types) is being used.
 * This is different from HashSet and LinkedHashSet.

 * ========================= TREE SET AND CUSTOM OBJECTS =========================
 *
 * TreeSet needs a way to determine how elements should be ordered.
 * For custom objects, this can be provided using:      Comparable or   Comparator
 * We will study these separately after completing the Map section.

 * TreeSet is not simply a "HashSet that sorts."
 * It is a sorted collection that also provides navigation operations
 * such as lower(), floor(), higher(), and ceiling().

 *
 * ========================= TIME COMPLEXITY =========================
 *
 * TreeSet is tree-based, so its basic operations generally take O(log n) time:
 *      add()      → O(log n)
 *      remove()   → O(log n)
 *      contains() → O(log n)
 * This is the trade-off for maintaining elements in sorted order.
 * HashSet generally provides O(1) average-time basic operations, but does not maintain sorted order.
 */

public class JCF_TreeSet {

    public static void main(String[] args) {

        // 1. Creating a TreeSet
        /*
         * TreeSet stores unique elements in sorted order.
         */
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        /*
         * Although the values were inserted in a different order,
         * TreeSet automatically keeps them sorted.
         */
        System.out.println("Numbers : " + numbers);

        // 2. Duplicate Elements
        /*
         * Duplicate elements are not stored.
         */
        boolean added = numbers.add(30);

        System.out.println("Was duplicate added? : " + added);
        System.out.println("Numbers : " + numbers);

        // 3. Basic Methods

        System.out.println("Contains 20? : " + numbers.contains(20));

        System.out.println("Contains 100? : " + numbers.contains(100));

        System.out.println("Size : " + numbers.size());

        System.out.println("Is Empty? : " + numbers.isEmpty());


        // 4. first() and last()
        /*
         * Because TreeSet is sorted:
         * first() -> smallest element
         * last()  -> largest element
         */
        System.out.println("First Element : " + numbers.first());

        System.out.println("Last Element : " + numbers.last());

        // 5. lower()
        /*
         * lower(30) returns the greatest element strictly smaller than 30.
         */
        System.out.println("Lower than 30 : " + numbers.lower(30));

        // 6. floor()
        /*
         * floor(30) returns the greatest element less than or equal to 30.
         */
        System.out.println("Floor of 30 : " + numbers.floor(30));

        System.out.println("Floor of 35 : " + numbers.floor(35));

        // 7. higher()
        /*
         * higher(30) returns the smallest element strictly greater than 30.
         */
        System.out.println("Higher than 30 : " + numbers.higher(30));

        // 8. ceiling()
        /*
         * ceiling(30) returns the smallest element greater than or equal to 30.
         */
        System.out.println("Ceiling of 30 : " + numbers.ceiling(30));

        System.out.println("Ceiling of 35 : " + numbers.ceiling(35));

        // 9. pollFirst()
        /*
         * pollFirst() returns AND removes the smallest element.
         */
        TreeSet<Integer> pollSet = new TreeSet<>(numbers);

        System.out.println("\nBefore pollFirst() : " + pollSet);

        int first = pollSet.pollFirst();

        System.out.println("Removed First : " + first);
        System.out.println("After pollFirst() : " + pollSet);

        // 10. pollLast()
        /*
         * pollLast() returns AND removes the largest element.
         */
        int last = pollSet.pollLast();

        System.out.println("Removed Last : " + last);
        System.out.println("After pollLast() : " + pollSet);

        // 11. headSet()
        /*
         * headSet(30) returns elements strictly smaller than 30.
         */
        TreeSet<Integer> rangeSet = new TreeSet<>();

        rangeSet.add(10);
        rangeSet.add(20);
        rangeSet.add(30);
        rangeSet.add(40);
        rangeSet.add(50);

        System.out.println("\nOriginal Set : " + rangeSet);

        System.out.println("headSet(30) : " + rangeSet.headSet(30));

        // 12. tailSet()
        /*
         * tailSet(30) returns elements greater than or equal to 30.
         */
        System.out.println("tailSet(30) : " + rangeSet.tailSet(30));

        // 13. subSet()
        /*
         * subSet(20, 50) returns elements from 20 inclusive
         * up to 50 exclusive.
         */
        System.out.println("subSet(20, 50) : " + rangeSet.subSet(20, 50));

        // 14. descendingSet()
        /*
         * Returns the elements in descending order.
         */
        System.out.println("Descending Set : " + rangeSet.descendingSet());

        // 15. String TreeSet
        /*
         * Strings are automatically arranged according to their natural ordering.
         */
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("\nFruits : " + fruits);

        // 16. Removing an Element

        fruits.remove("Banana");

        System.out.println("After removing Banana : " + fruits);

        // 17. Iterating through TreeSet
        System.out.println("\nIterating TreeSet:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 18. Clearing a TreeSet
        fruits.clear();

        System.out.println("After clear() : " + fruits);
    }
}