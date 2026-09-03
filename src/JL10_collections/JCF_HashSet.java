package JL10_collections;

import java.util.HashSet;
import java.util.Iterator;

public class JCF_HashSet {
    public static void main(String[] args) {

//           HashSet is an implementation of the Set interface.
//           Set → Collection that does NOT allow duplicate elements.
//           HashSet mainly uses hashing internally to store and efficiently search for elements.
//          
//           Important properties of HashSet:
//           1. Does NOT allow duplicate elements.
//           2. Does NOT guarantee insertion order.
//           3. Does NOT provide index-based access.
//           4. Allows ONE null element.
//           5. Uses hashing for efficient operations.

        HashSet<Integer> numbers = new HashSet<>();

//           add() adds an element to the HashSet.
//           It returns:
//           true  → element was successfully added
//           false → element already existed
//           Since HashSet does not allow duplicates, adding an existing element does nothing.
        System.out.println("Add 10 : " + numbers.add(10));
        System.out.println("Add 20 : " + numbers.add(20));
        System.out.println("Add 30 : " + numbers.add(30));
        System.out.println("HashSet : " + numbers);
        // Trying to add duplicate element
        System.out.println("Add duplicate 20 : " + numbers.add(20));
        System.out.println("HashSet after duplicate : " + numbers);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        System.out.println("After adding 10 multiple times : " + numbers);

//           contains() checks whether an element exists in the HashSet.
//           Returns:
//           true  → element exists
//           false → element does not exist
        System.out.println("Contains 20 : " + numbers.contains(20));
        System.out.println("Contains 100 : " + numbers.contains(100));

//           remove() removes the specified element.
//           Returns:
//           true  → element was found and removed
//           false → element was not present
        System.out.println("Remove 20 : " + numbers.remove(20));
        System.out.println("After removing 20 : " + numbers);
        System.out.println("Remove 100 : " + numbers.remove(100));

//           size() returns the number of UNIQUE elements currently stored in the HashSet.
        System.out.println("Size : " + numbers.size());

//           isEmpty() checks whether the HashSet contains no elements.
//           Returns:
//           true  → HashSet is empty
//           false → HashSet contains elements
        System.out.println("Is Empty : " + numbers.isEmpty());

//           clear() removes ALL elements from the HashSet.
        HashSet<Integer> tempSet = new HashSet<>();
        tempSet.add(10);
        tempSet.add(20);
        tempSet.add(30);
        System.out.println("Before clear : " + tempSet);
        tempSet.clear();
        System.out.println("After clear : " + tempSet);

//           HashSet allows ONE null element.
//           Multiple null values are treated as duplicates.
        HashSet<Integer> nullSet = new HashSet<>();
        nullSet.add(null);
        nullSet.add(10);
        nullSet.add(null);
        System.out.println("HashSet with null : " + nullSet);

//           HashSet does NOT support index-based traversal because it is not a List.
//           Therefore, we cannot do:
//           numbers.get(0);       // NOT AVAILABLE
//           Instead, use an enhanced for loop.
        System.out.println("Elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

//           HashSet can also be traversed using Iterator.
        System.out.println("Elements using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//           HashSet does NOT guarantee that elements will be returned in the same order in which they were inserted.
//           Therefore, do NOT depend on the output order of HashSet.
//           If insertion order needs to be maintained, Java provides: LinkedHashSet
        HashSet<Integer> unorderedSet = new HashSet<>();
        unorderedSet.add(50);
        unorderedSet.add(10);
        unorderedSet.add(40);
        unorderedSet.add(20);
        unorderedSet.add(30);
        System.out.println("HashSet : " + unorderedSet);

//           HashSet uses hashing internally.
//           When an element is added:
//                Element
//                   ↓
//               hashCode()
//                   ↓
//             Hashing mechanism
//                   ↓
//             Appropriate location
//           This helps HashSet perform operations such as contains() and remove() efficiently.

//           ArrayList:
//           - Allows duplicates
//           - Maintains insertion order
//           - Provides index-based access
//           HashSet:
//           - Does NOT allow duplicates
//           - Does NOT guarantee insertion order
//           - Does NOT provide index-based access
//          
//           Use ArrayList when you need a LIST.
//           Use HashSet when you mainly need UNIQUE elements.

//           Set
//            │
//            ├── HashSet
//            │      → No guaranteed order
//            │
//            ├── LinkedHashSet
//            │      → Maintains insertion order
//            │
//            └── TreeSet
//                   → Maintains sorted order
    }
}