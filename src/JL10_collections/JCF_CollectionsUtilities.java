package JL10_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *                 COLLECTIONS UTILITY CLASS

 * Collections:
 * - Collections is a utility class from java.util.
 * - It provides ready-made methods for working with collection objects, especially Lists.

 * Collection  -> Interface
 * Collections -> Utility class

 * Important methods:                                           Typical complexity:
 * sort()               -> sorts elements                           O(n log n)
 * reverse()            -> reverses the list                            O(n)
 * shuffle()            -> randomly rearranges elements                 O(n)
 * max()                -> returns maximum element                      O(n)
 * min()                -> returns minimum element                      O(n)
 * frequency()          -> counts occurrences of an element             O(n)
 * binarySearch()       -> searches a sorted list                     O(log n)
 * fill()               -> replaces all elements                        O(n)
 * swap()               -> swaps two elements                           O(1)
 * copy()               -> copies one list into another                 O(n)
 * disjoint()           -> checks whether collections have     Varies depending on the types of
 *                          no common elements                   collections passed into it
 */

public class JCF_CollectionsUtilities {

    public static void main(String[] args) {

        // Creating a List

        List<Integer> numbers = new ArrayList<>(Arrays.asList(40, 10, 30, 20, 20));
        // Arrays.asList( , , , ...):
        // This utility method wraps the provided numbers into a fixed-size list.
        // You cannot add or remove elements from this specific list later,
        // but you can modify individual elements.

        System.out.println("Original List: " + numbers);

        // 1. sort()
        // Sorts the list in ascending natural order.

        Collections.sort(numbers);
        System.out.println("After sort(): " + numbers);

        // 2. reverse()
        // Reverses the current order of elements.

        Collections.reverse(numbers);
        System.out.println("After reverse(): " + numbers);

        // 3. shuffle()
        // Randomly rearranges the elements.

        Collections.shuffle(numbers);
        System.out.println("After shuffle(): " + numbers);

        // 4. max()
        // Returns the largest element.

        Integer maximum = Collections.max(numbers);
        System.out.println("Maximum: " + maximum);

        // 5. min()
        // Returns the smallest element.

        Integer minimum = Collections.min(numbers);
        System.out.println("Minimum: " + minimum);

        // 6. frequency()
        // Counts how many times element occurs in the list.

        int frequency = Collections.frequency(numbers, 20);
        System.out.println("Frequency of 20: " + frequency);

        // 7. binarySearch()
        // Binary search requires a sorted list.
        // Therefore, sort the list before searching.

        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);


        // 8. fill()
        // Replace every element with the given value.

        List<Integer> filledList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Collections.fill(filledList, 0);
        System.out.println("After fill(): " + filledList);

        // 9. swap()
        // Swaps elements at two indexes.

        List<Integer> swapList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        Collections.swap(swapList, 0, 2);
        System.out.println("After swap(): " + swapList);

        // 10. copy()
        // Copies elements from source to destination.
        // Destination must already contain enough elements.

        List<Integer> source = Arrays.asList(100, 200, 300);

        List<Integer> destination = new ArrayList<>(Arrays.asList(0, 0, 0));
        // new ArrayList<>(...): Instantiates a brand new, standard resizable array-based list.
        // Arrays.asList(0, 0, 0): Passes a dummy fixed-size list with three zeros to populate the ArrayList.

        Collections.copy(destination, source);
        //  Collections.copy() requires the destination list to already be at least the same size as the source list.
        //  If you created an empty list (new ArrayList<>()), the next line would crash with an IndexOutOfBoundsException.
        //  Pre-populating it with placeholder zeros sets its size to 3.

        System.out.println("After copy(): " + destination);

        // 11. disjoint()
        // Checks whether two collections have no elements in common.

        List<Integer> firstList = Arrays.asList(10, 20, 30);

        List<Integer> secondList = Arrays.asList(40, 50, 60);

        boolean disjoint = Collections.disjoint(firstList, secondList);

        System.out.println("Collections are disjoint: " + disjoint);
    }
}