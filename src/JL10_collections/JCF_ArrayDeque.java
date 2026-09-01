package JL10_collections;

import java.util.ArrayDeque;
import java.util.Iterator;

//                                ArrayDeque
//                                    │
//                             implements Deque
//                                    │
//                      ┌─────────────┴─────────────┐
//                      ↓                           ↓
//                    Queue                       Stack
//                      │                           │
//              offer / poll / peek          push / pop / peek

public class JCF_ArrayDeque {
    public static void main(String[] args) {
//           ARRAYDEQUE is a resizable-array implementation of the Deque interface.
//           Deque = Double Ended Queue
//           It allows insertion and removal from BOTH ends:
//                 FRONT                         REAR
//                   ↓                             ↓
//                 [10] [20] [30] [40]
//                   ↑                             ↑
//                add/remove                    add/remove
//           ArrayDeque can be used as:
//           1. Deque  → operations from both ends
//           2. Queue  → FIFO (First In First Out)
//           3. Stack  → LIFO (Last In First Out)
//           ArrayDeque does NOT allow null elements.
//           Unlike ArrayList, ArrayDeque does not provide index-based
//           methods such as get(index), set(index), or indexOf().
//           It is designed mainly for operations at the FRONT and REAR.

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // ADDING ELEMENTS
//           addFirst() → adds an element at the FRONT.
//          
//           addLast() → adds an element at the REAR.
        numbers.addFirst(20);
        numbers.addLast(30);
        numbers.addFirst(10);
        numbers.addLast(40);
        System.out.println("After addFirst/addLast : " + numbers);
        // [10, 20, 30, 40]

//           offerFirst() and offerLast() also add elements at the front and rear.
//           They are commonly used when we want the Queue/Deque-style "offer" terminology.
        numbers.offerFirst(5);
        numbers.offerLast(50);
        System.out.println("After offerFirst/offerLast : " + numbers);
        // [5, 10, 20, 30, 40, 50]

        // ACCESSING ELEMENTS
//           getFirst() → returns the first element.
//           getLast()  → returns the last element.
//           These methods throw an exception if the deque is empty.
        System.out.println("First Element : " + numbers.getFirst());
        System.out.println("Last Element : " + numbers.getLast());

//           peekFirst() and peekLast() also look at the elements without removing them.
//           Difference:
//           getFirst()/getLast()
//                → throw exception if deque is empty
//           peekFirst()/peekLast()
//                → return null if deque is empty
//           ArrayDeque does not allow null elements, so null can safely indicate that no element is available.
        System.out.println("Peek First : " + numbers.peekFirst());
        System.out.println("Peek Last : " + numbers.peekLast());

        // REMOVING ELEMENTS FROM BOTH ENDS
//           removeFirst() → removes and returns the first element.
//           removeLast()  → removes and returns the last element.
//           These throw an exception if the deque is empty.
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removeFirst/removeLast : " + numbers);

//           pollFirst() and pollLast() also remove elements.
//           Difference:
//           removeFirst()/removeLast()
//                → throw exception if empty
//           pollFirst()/pollLast()
//                → return null if empty
        numbers.pollFirst();
        numbers.pollLast();
        System.out.println("After pollFirst/pollLast : " + numbers);

        // ARRAYDEQUE AS A STACK
//         ArrayDeque follows LIFO as Stack:
//           Last In → First Out
//           A Deque can be used as a Stack.
//           Java's push(), pop() and peek() methods use the FRONT of the Deque as the Stack's TOP.
//           push() → addFirst()
//           pop()  → removeFirst()
//           peek() → peekFirst()
        numbers.push(60);
        numbers.push(70);
        numbers.push(80);
        System.out.println("After push : " + numbers);
        System.out.println("Stack Top : " + numbers.peek());
        System.out.println("Popped Element : " + numbers.pop());
        System.out.println("After pop : " + numbers);

        // ARRAYDEQUE AS A QUEUE
//           ArrayDeque follows FIFO as Queue:
//           First In → First Out
//           Elements are added at the REAR and removed from the FRONT.
//           offer() → adds at the rear
//           poll()  → removes from the front
//           peek()  → looks at the front
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue : " + queue);
        System.out.println("Front : " + queue.peek());
        System.out.println("Removed : " + queue.poll());
        System.out.println("Queue after poll : " + queue);

//           contains() checks whether a particular element exists.
//           Returns:
//           true  → element exists
//           false → element does not exist
        System.out.println("Contains 70 : " + numbers.contains(70));
        System.out.println("Contains 100 : " + numbers.contains(100));

//           removeFirstOccurrence() removes the FIRST occurrence of the specified element.
//           Example:
//           [10, 20, 30, 20, 40]
//           removeFirstOccurrence(20)
//           Result:
//           [10, 30, 20, 40]
        ArrayDeque<Integer> duplicateNumbers = new ArrayDeque<>();
        duplicateNumbers.add(10);
        duplicateNumbers.add(20);
        duplicateNumbers.add(30);
        duplicateNumbers.add(20);
        duplicateNumbers.add(40);
        duplicateNumbers.removeFirstOccurrence(20);
        System.out.println("After removeFirstOccurrence : " + duplicateNumbers);

//           removeLastOccurrence() removes the LAST occurrence of the specified element.
//           Example:
//           [10, 20, 30, 20, 40]
//           removeLastOccurrence(20)
//           Result:
//           [10, 20, 30, 40]
        duplicateNumbers.removeLastOccurrence(20);
        System.out.println("After removeLastOccurrence : " + duplicateNumbers);

//           size() returns the number of elements currently present.
        System.out.println("Size : " + numbers.size());

//           isEmpty() checks whether the deque contains no elements.
//           Returns:
//           true  → empty
//           false → contains elements
        System.out.println("Is Empty : " + numbers.isEmpty());

        // TRAVERSING ARRAY DEQUE
//           ArrayDeque can be traversed using an enhanced for loop.
//           This visits the elements in deque order.
        System.out.println("Elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
//           ArrayDeque also provides an Iterator.
        System.out.println("Elements using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//           clear() removes ALL elements from the deque.
        duplicateNumbers.clear();
        System.out.println("After clear : " + duplicateNumbers);
        // []

        // ARRAYLIST vs LINKED LIST vs ARRAYDEQUE
//           ArrayList: Best suited for list operations and index-based access.
//          
//           LinkedList: Doubly linked structure that can work as a List and Deque.
//          
//           ArrayDeque: Resizable-array structure designed specifically for operations at both ends.
//          
//           ArrayList
//               ↓
//           List + index-based access
//           LinkedList
//               ↓
//           List + Queue + Deque
//           ArrayDeque
//               ↓
//           Queue + Deque + Stack behavior
    }
}