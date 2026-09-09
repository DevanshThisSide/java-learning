package JL10_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 *                    QUEUE AND DEQUE

 * Queue:
 * - Queue is an interface in the Collections Framework.
 * - Generally follows FIFO:      First In, First Out

 * Important Queue methods:
 *      offer()  -> inserts element
 *      poll()   -> removes and returns front element
 *      peek()   -> returns front element without removing it

 * add() / remove() / element()
 *      -> may throw exceptions when the operation fails
 * offer() / poll() / peek()
 *      -> safer alternatives for normal Queue operations (returns false/null)

 * PriorityQueue:
 * - Processes elements according to priority.
 * - With natural ordering, the smallest element has the highest priority.

 * Deque:
 * - Double Ended Queue.
 * - Allows insertion and removal from both ends.

 * ArrayDeque:
 * - Resizable-array implementation of Deque.
 * - Can be used as both:
 *      Queue -> FIFO
 *      Stack -> LIFO

 * Important :
 *  Queue/Deque is an interface, while ArrayDeque/PriorityQueue is a concrete class that implements that interface.
 *  You cannot instantiate Queue/Deque directly; you must use an implementing class like ArrayDeque or PriorityQueue.
 */

public class JCF_QueueDeque {

    public static void main(String[] args) {

        // 1. Basic Queue
        // Declaring using the interface, instantiating with the implementation

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue: " + queue);

        // 2. peek()
        // Returns the front element without removing it.

        System.out.println("Front using peek(): " + queue.peek());

        System.out.println("Queue after peek(): " + queue);

        // 3. poll()
        // Removes and returns the front element.

        System.out.println("Removed using poll(): " + queue.poll());

        System.out.println("Queue after poll(): " + queue);

        // 4. PriorityQueue
        // Elements are processed according to priority.
        // Natural ordering: Smaller number = higher priority.

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(40);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue: " + priorityQueue);

        System.out.println("Highest priority: " + priorityQueue.peek());

        System.out.println("Removed: " + priorityQueue.poll());

        System.out.println("Next highest priority: " + priorityQueue.peek());

        // Elements will be automatically sorted in ascending order (natural ordering)
        // Declaring using the interface, instantiating with the implementation
        // Queue<Integer> pQueue = new PriorityQueue<>();

        // 5. Deque as a Queue
        // Declaring using the interface, instantiating with the implementation

        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerLast(30);

        System.out.println("\nDeque as Queue: " + deque);

        System.out.println("Removed from front: " + deque.pollFirst());

        // 6. Deque from both ends

        deque.offerFirst(5);
        deque.offerLast(40);

        System.out.println("After adding from both ends: " + deque);

        System.out.println("Removed from front: " + deque.pollFirst());

        System.out.println("Removed from rear: " + deque.pollLast());

        System.out.println("Deque after removing both ends: " + deque);


        // 7. ArrayDeque as a Stack
        // Declaring using the interface, instantiating with the implementation

        Deque<Integer> stack = new ArrayDeque<>();

        // push(e) is an alias for addFirst(e)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nArrayDeque as Stack: " + stack);

        // pop() is an alias for removeFirst()
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop(): " + stack);
    }
}