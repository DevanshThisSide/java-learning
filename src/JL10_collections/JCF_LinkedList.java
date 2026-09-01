package JL10_collections;

//   LinkedList is a class in Java's Collection Framework used to store an ordered collection of elements.
//   It implements:     List , Deque
//   Therefore, LinkedList can be used as a normal List as well as
//   a Queue, Deque, or Stack-like data structure.
//  
//   Unlike ArrayList, which is backed by a dynamic array, LinkedList stores its elements inside nodes.
//   Conceptually:
//        [10] <-> [20] <-> [30] <-> [40]
//   Each node conceptually contains:   Previous reference ,  Data  ,  Next reference
//        previous <- [ data ] -> next
//
//   Java's LinkedList is a DOUBLY LINKED LIST because each node is connected in both forward and backward directions.
//
//                  ARRAYLIST vs LINKEDLIST
//   ArrayList:
//        [10] [20] [30] [40]
//        - Array-based structure
//        - Fast index-based access
//        - Generally uses less memory
//        - Usually the better default choice for normal List usage
//   LinkedList:
//        [10] <-> [20] <-> [30] <-> [40]
//        - Node-based structure
//        - Index-based access is slower because nodes may need
//          to be traversed to reach the required position
//        - Uses more memory because nodes store additional
//          references
//        - Useful when operations at the ends of the list are
//          frequent
//        - Can also work as a Queue, Deque, or Stack-like structure
//
//   ArrayList is generally useful when:
//        - We frequently access elements using indexes.
//        - We mostly read/search elements.
//        - We need a general-purpose List.
//   LinkedList is useful when:
//        - We frequently add/remove elements at the beginning
//          or end.
//        - We need Queue or Deque behavior.
//        - We need operations from both ends of the collection.
//   IMPORTANT:
//   LinkedList is NOT automatically better than ArrayList for every insertion or deletion.
//    Finding an element or position in a LinkedList can itself require traversal.
//   In most ordinary applications, ArrayList is usually preferred unless LinkedList/Deque behavior is actually useful.
//
//   Deque means:     Double Ended Queue
//   A Deque allows elements to be added and removed from BOTH the beginning and the end.
//        Front                         Rear
//          ↓                             ↓
//        [10] <-> [20] <-> [30] <-> [40]
//          ↑                             ↑
//        remove/add                    remove/add
//   LinkedList implements the Deque interface, which is why it provides methods such as:
//        addFirst()  addLast()  removeFirst()  removeLast()  peekFirst()  peekLast()  pollFirst()  pollLast()
//
//   A Queue follows:      FIFO = First In, First Out
//   Example:   First → [10] [20] [30] ← Last
//   If 10 entered first, 10 leaves first.
//   Queue-style LinkedList methods include:    offer()    peek()    poll()        
//
//   Stack follows:      LIFO = Last In, First Out
//   Example: The last element added is the first element removed.
//               ↑ pop()
//              [30]
//              [20]
//              [10]
//               ↓ push()
//   LinkedList provides: push()  pop()
//   Therefore, LinkedList can provide Stack-like behavior as well.
//
//
//   Queue:   FIFO      First In → First Out
//   Stack:   LIFO      Last In → First Out
//   Deque:   Both ends can be used.
//
//                           Collection
//                                |
//                               List
//                              /    \
//                     ArrayList    LinkedList
//                                    |
//                           implements Deque
//                                    |
//                      ┌─────────────┼─────────────┐
//                      ↓             ↓             ↓
//                    Queue         Deque        Stack-like
//                      |             |             |
//                    FIFO      Both ends       LIFO behavior
//  
//  
//   ArrayList  → Array-based List
//   LinkedList → Doubly Linked List + Deque functionality
//   LinkedList can therefore be used as: List   Queue   Deque   Stack-like structure
// 
//   ArrayList:
//        Best remembered as an array-based List with fast
//        index-based access.
//   LinkedList:
//        Best remembered as a doubly linked list that also
//        provides Deque operations from both ends.
//
//   The important difference is not just the method names.
//   The internal data structure and the interfaces implemented by the class determine how and when each collection is useful.
// 

import java.util.LinkedList;

public class JCF_LinkedList {

    public static void main(String[] args) {
        // Creating a LinkedList of Integer objects.
        LinkedList<Integer> numbers = new LinkedList<>();

        // 1. ADDING ELEMENTS
        // add(element) → Adds an element at the end of the list.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // add(index, element) → Adds an element at a specific index.
        numbers.add(1, 15);
        // addFirst(element) → Adds an element at the beginning.
        // This method is specific to LinkedList/Deque.
        numbers.addFirst(5);
        // addLast(element) → Adds an element at the end.
        // This method is specific to LinkedList/Deque.
        numbers.addLast(40);
        System.out.println("After adding elements : " + numbers);

        // 2. ADDING MULTIPLE ELEMENTS
        LinkedList<Integer> extraNumbers = new LinkedList<>();
        extraNumbers.add(50);
        extraNumbers.add(60);
        // addAll(collection) → Adds all elements of another collection at the end of the current LinkedList.
        numbers.addAll(extraNumbers);
        System.out.println("After addAll() : " + numbers);
        // addAll(index, collection) → Adds all elements starting
        // from the specified index.
        numbers.addAll(2, extraNumbers);
        System.out.println("After addAll(index, collection) : " + numbers);

        // 3. ACCESSING ELEMENTS
        // get(index) → Returns the element at the specified index.
        System.out.println("Element at index 2 : " + numbers.get(2));
        // getFirst() → Returns the first element.
        // Specific to LinkedList/Deque.
        System.out.println("First element : " + numbers.getFirst());
        // getLast() → Returns the last element.
        // Specific to LinkedList/Deque.
        System.out.println("Last element : " + numbers.getLast());

        // 4. UPDATING ELEMENTS
        // set(index, element) → Replaces the element at an index.
        numbers.set(1, 100);
        System.out.println("After set() : " + numbers);

        // 5. SEARCHING ELEMENTS
        // contains(element) → Checks whether the element exists.
        System.out.println("Contains 30 : " + numbers.contains(30));
        // indexOf(element) → Returns the first occurrence of an element.
        System.out.println("Index of 30 : " + numbers.indexOf(30));
        // lastIndexOf(element) → Returns the last occurrence.
        System.out.println("Last index of 30 : " + numbers.lastIndexOf(30));
        // containsAll(collection) → Checks whether all elements of another collection exist in this list.
        System.out.println("Contains all extra numbers : " + numbers.containsAll(extraNumbers));

        // 6. SIZE AND EMPTY CHECK
        // size() → Returns the number of elements.
        System.out.println("Size : " + numbers.size());
        // isEmpty() → Returns true if the list contains no elements.
        System.out.println("Is empty : " + numbers.isEmpty());

        // 7. REMOVING ELEMENTS
        // remove(index) → Removes the element at the specified index.
        numbers.remove(2);
        System.out.println("After remove(index) : " + numbers);
        // remove(Object) → Removes the first occurrence of the object.
        numbers.remove(Integer.valueOf(30));
        System.out.println("After remove(object) : " + numbers);
        // removeFirst() → Removes the first element.
        // Specific to LinkedList/Deque.
        numbers.removeFirst();
        System.out.println("After removeFirst() : " + numbers);
        // removeLast() → Removes the last element.
        // Specific to LinkedList/Deque.
        numbers.removeLast();
        System.out.println("After removeLast() : " + numbers);
        // removeFirstOccurrence(Object) → Removes the first occurrence of the specified element from the LinkedList.
        numbers.removeFirstOccurrence(30);
        System.out.println("After removeFirstOccurrence() : " + numbers);
        // removeLastOccurrence(Object) → Removes the last occurrence of the specified element from the LinkedList.
        numbers.removeLastOccurrence(30);
        System.out.println("After removeLastOccurrence() : " + numbers);

        // 8. QUEUE-STYLE METHODS
        // offer(element) → Adds an element at the end of the list.
        // It is a Queue-style alternative to add().
        numbers.offer(70);
        System.out.println("After offer() : " + numbers);
        // offerFirst(element) → Adds an element at the beginning.
        numbers.offerFirst(1);
        // offerLast(element) → Adds an element at the end.
        numbers.offerLast(80);
        System.out.println("After offerFirst() and offerLast() : " + numbers);

        // 9. PEEK METHODS
        // peek() → Returns the first element without removing it.
        // Returns null if the list is empty.
        System.out.println("peek() : " + numbers.peek());
        // peekFirst() → Returns the first element without removing it.
        System.out.println("peekFirst() : " + numbers.peekFirst());
        // peekLast() → Returns the last element without removing it.
        System.out.println("peekLast() : " + numbers.peekLast());

        // 10. POLL METHODS
        // poll() → Returns and removes the first element.
        // Returns null if the list is empty.
        System.out.println("poll() removed : " + numbers.poll());
        // pollFirst() → Removes and returns the first element.
        numbers.pollFirst();
        // pollLast() → Removes and returns the last element.
        numbers.pollLast();
        System.out.println("After poll methods : " + numbers);

        // 11. STACK-STYLE METHODS
        // push(element) → Adds an element at the beginning.
        // LinkedList can work like a Stack because it implements Deque.
        numbers.push(500);
        System.out.println("After push() : " + numbers);
        // pop() → Removes and returns the first element.
        numbers.pop();
        System.out.println("After pop() : " + numbers);

        // 12. REMOVE ALL ELEMENTS
        // removeAll(collection) → Removes all elements from this list that are also present in the specified collection.
        numbers.removeAll(extraNumbers);
        System.out.println("After removeAll() : " + numbers);
        // retainAll(collection) → Keeps only the elements that are also present in the specified collection.
        numbers.retainAll(extraNumbers);
        System.out.println("After retainAll() : " + numbers);

        // 13. CONVERTING LINKED LIST TO ARRAY
        // toArray() → Converts the LinkedList into an Object[].
        Object[] objectArray = numbers.toArray();
        // toArray(T[]) → Converts the LinkedList into a specific type of array.
        Integer[] integerArray = numbers.toArray(new Integer[0]);
        System.out.println("Object array size : " + objectArray.length);
        System.out.println("Integer array size : " + integerArray.length);

        // 14. ITERATING THROUGH LINKED LIST
        // Enhanced for loop can be used to traverse the LinkedList.
        System.out.print("Elements : ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 15. CLEARING THE LINKED LIST
        // clear() → Removes all elements from the LinkedList.
        numbers.clear();
        System.out.println("After clear() : " + numbers);
        // isEmpty() can now be used to verify that the list is empty.
        System.out.print("Is empty after clear() : " + numbers.isEmpty());
    }
}