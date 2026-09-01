package JL10_collections;

// JAVA COLLECTION FRAMEWORK (JCF)
// Collection Framework:
//           The Java Collection Framework is a set of interfaces, classes
//           and utility methods used to store and manipulate groups of objects.

// COLLECTION vs COLLECTIONS:
//      Collection:
//            An interface representing a group of objects.
//      Collections:
//            A utility class in java.util containing useful methods
//            for working with collections.
//      Collection Framework:
//            The complete system of interfaces, classes and utilities
//            provided by Java for handling groups of objects.

// COLLECTIONS AND OBJECTS:
//         Collections generally store objects rather than primitive types.
//         Primitive       Wrapper Class
//        -------------------------------
//          int          -> Integer
//          double       -> Double
//          char         -> Character
//          boolean      -> Boolean
//          long         -> Long
//          Example: ArrayList<Integer> numbers;
//    Integer is used instead of int because collections work with objects.
//    Java's autoboxing can automatically convert primitive values into their corresponding wrapper objects.

import java.util.ArrayList;
import java.util.Arrays;

public class JCF_ArrayList {
    public static void main(String[] args) {

        // 1. CREATING AN ARRAYLIST :
        // ArrayList is a class in Java that implements the List interface, is a resizable/dynamic array.
        //It is similar to an array, but its size can grow and shrink dynamically.
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Initial List: " + numbers);

        // 2. add()
        // Adds an element at the end of the ArrayList.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        System.out.println("\nAfter add(): " + numbers);

        // 3. add(index, element)
        // Adds an element at a specific index.
        // Existing elements from that position shift to the right.
        numbers.add(1, 15);
        System.out.println("After add(index, element): " + numbers);

        // 4. addFirst() and addLast()
        // addFirst() adds an element at the beginning.
        numbers.addFirst(5);
        // addLast() adds an element at the end.
        numbers.addLast(40);
        System.out.println("After addFirst() and addLast(): " + numbers);

        // 5. addAll()
        ArrayList<Integer> extraNumbers = new ArrayList<>();
        extraNumbers.add(50);
        extraNumbers.add(60);
        // Adds all elements of another collection at the end.
        numbers.addAll(extraNumbers);
        System.out.println("After addAll(): " + numbers);

        // 6. addAll(index, collection)
        // Adds all elements at a specific position.
        numbers.addAll(2, Arrays.asList(100, 200));
        System.out.println("After addAll(index, collection): " + numbers);

        // 7. get()
        // Returns the element present at the specified index.
        System.out.println("\nElement at index 2: " + numbers.get(2));

        // 8. set()
        // Replaces the element at the specified index.
        numbers.set(2, 999);
        System.out.println("After set(): " + numbers);

        // 9. size()
        // Returns the number of elements currently present.
        System.out.println("Size of ArrayList: " + numbers.size());

        // 10. contains()
        // Checks whether the specified element exists.
        System.out.println("Contains 20? " + numbers.contains(20));

        // 11. containsAll()
        // Checks whether all elements of another collection exist.
        System.out.println("Contains all extra numbers? " + numbers.containsAll(extraNumbers));

        // 12. indexOf()
        // Returns the index of the first occurrence of an element.
        System.out.println("First index of 20: " + numbers.indexOf(20));

        // 13. lastIndexOf()
        // Returns the index of the last occurrence of an element.
        System.out.println("Last index of 20: " + numbers.lastIndexOf(20));

        // 14. isEmpty()
        // Returns true if the ArrayList contains no elements.
        System.out.println("Is list empty? " + numbers.isEmpty());

        // 15. remove(index)
        // Removes the element at the specified index.
        numbers.remove(2);
        System.out.println("After remove(index): " + numbers);

        // 16. remove(Object)
        // Removes the first occurrence of the specified object.
        numbers.remove(Integer.valueOf(20));
        System.out.println("After remove(Object): " + numbers);

        // 17. removeAll()
        // Removes all elements that are also present in the specified collection.
        numbers.removeAll(extraNumbers);
        System.out.println("After removeAll(): " + numbers);

        // 18. retainAll()
        // Keeps only the elements that are also present in the specified collection.
        numbers.retainAll(Arrays.asList(5, 10, 30, 40, 999));
        System.out.println("After retainAll(): " + numbers);

        // 19. removeFirst() and removeLast()
        // These methods are available with Java 21's
        // SequencedCollection support.
        if (!numbers.isEmpty()) {
            numbers.removeFirst();
        }
        if (!numbers.isEmpty()) {
            numbers.removeLast();
        }
        System.out.println("After removeFirst() and removeLast(): " + numbers);

        // 20. toArray()
        // Converts the ArrayList into a java array of general Object[] type .
        Object[] array = numbers.toArray(); // toArray() method is designed to return Object[] .
        System.out.println("Array using toArray(): " + Arrays.toString(array));

        // 21. toArray(T[] array)
        // Converts the ArrayList into a java array of type Integer[] specifically .
        Integer[] integerArray = numbers.toArray(new Integer[0]);
        System.out.println("Integer array: " + Arrays.toString(integerArray));

        // 22. clear()
        // Removes all elements from the ArrayList.
        numbers.clear();
        System.out.println("After clear(): " + numbers);

        // 23. clone()
        ArrayList<Integer> original = new ArrayList<>();

        original.add(10);
        original.add(20);
        original.add(30);

        // clone() creates a shallow copy of the ArrayList.
        // The returned object needs to be cast to ArrayList<Integer>.
        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        System.out.println("\nOriginal List: " + original);
        System.out.println("Cloned List: " + cloned);

        // 24. ensureCapacity()
        // Ensures that the internal ArrayList capacity is at least the specified value.
        // It does NOT change the actual size of the ArrayList.
        original.ensureCapacity(100);   // Make sure the internal storage has room for at least 100 elements.
        System.out.println("Size after ensureCapacity(): " + original.size());

        // 25. trimToSize()
        // Reduces the internal capacity of the ArrayList to its current size.
        // It does NOT remove elements.
        original.trimToSize();  // I don't need extra internal capacity anymore.
        // Reduce the internal capacity to approximately my current size
        System.out.println("List after trimToSize(): " + original);

        // 26. clone() vs reference assignment
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        // Both references point to the SAME ArrayList object.
        ArrayList<Integer> list2 = list1;
        list2.add(300);
        System.out.println("\nlist1: " + list1);
        System.out.println("list2: " + list2);
        // Adding through list2 also changes list1 because both references point to the same object.

        // 27. ArrayList with String
        ArrayList<String> names = new ArrayList<>();
        names.add("Devansh");
        names.add("Rahul");
        names.add("Aman");
        System.out.println("\nString ArrayList: " + names);

        // 28. ArrayList supports duplicate elements
        names.add("Rahul");
        System.out.println("Duplicates allowed: " + names);

        // 29. ArrayList maintains insertion order
        // Elements are stored in the order in which they are added.
        System.out.println("Insertion order: " + names);

//          Java provides autoboxing and unboxing to automatically
//          convert between primitive values and wrapper objects.
    }
}