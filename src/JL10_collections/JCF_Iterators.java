package JL10_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *                       ITERATORS

 * Iterator:
 * - Used to traverse a collection one element at a time.
 * - Provides a common way to access collection elements.

 * Main methods:
      hasNext()          -> checks whether another element exists
      next()             -> returns the next element
      remove()           -> removes the last element returned by next()

 * Basic traversal:
 *      while (iterator.hasNext()) {
 *          iterator.next();
 *      }

 * ListIterator:
 * - A specialized iterator for List implementations.
 * - Supports both forward and backward traversal.
 * - Can add, remove and replace elements.

 * Iterator:            Forward traversal
 * ListIterator:        Forward + Backward traversal
 */

public class JCF_Iterators {

    public static void main(String[] args) {

        // Creating a List

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // 1. Creating an Iterator

        Iterator<Integer> iterator = numbers.iterator();

        // 2. Traversing using Iterator

        System.out.println("=== Iterator Traversal ===");

        while (iterator.hasNext()) {

            Integer number = iterator.next(); // Creates a new variable named number of type Integer.
            System.out.println(number);
        }

        // 3. Removing elements using Iterator
        // We create a new iterator because the previous iterator has already reached the end.

        iterator = numbers.iterator();

        while (iterator.hasNext()) {

            Integer number = iterator.next();
            if (number == 20) {
                iterator.remove(); // It removes the last element returned by next().
            }
        }
        System.out.println("\nAfter removing 20: " + numbers);

        // 4. Creating a ListIterator

        ListIterator<Integer> listIterator = numbers.listIterator();

        // 5. Forward traversal

        System.out.println("\n=== ListIterator Forward ===");

        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());
        }
        // Now the iterator is at the last element.
        // Forward traversal moves the cursor to the very end of the list.
        // Can be used for Backward traversal from the end using previous()

        // 6. Backward traversal

        System.out.println("\n=== ListIterator Backward ===");

        while (listIterator.hasPrevious()) {

            System.out.println(listIterator.previous());
        }

        // 7. Adding using ListIterator
        // The iterator is currently at the beginning because
        // the previous traversal moved it backward completely.

        listIterator.add(50);

        System.out.println("\nAfter adding 50: " + numbers);

        // 8. Replacing using ListIterator
        // Create a new ListIterator and search for 30.

        listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {

            Integer number = listIterator.next();
            if (number == 30) {
                listIterator.set(300);
            }
        }

        System.out.println("After replacing 30 with 300: " + numbers);
    }
}