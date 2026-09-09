package JL10_collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 *             PRIORITY QUEUE + COMPARATOR

 * PriorityQueue:
 * - Processes elements according to priority.
 * - For objects, Java needs to know how priority is decided.

 * Comparator:
 * - Defines custom ordering outside the class.
 * - Here, Comparator determines the priority of Student objects based on their marks.
 *
 * Lambda: - We use a lambda expression to create the Comparator in a concise way.

 * Flow:
 *          Student Objects
 *                 ↓
 *           Comparator
 *                 ↓
 *           PriorityQueue
 *                 ↓
 *    Highest-priority student comes out first

 * PriorityQueue does NOT guarantee that printing or iterating
 * over the queue will display all elements in sorted order.
 * poll() always removes the current highest-priority element.

 * For guaranteed priority processing, use:
                                            while (!queue.isEmpty()) {
                                                System.out.println(queue.poll());
                                            }
 */

class PriorityStudent {

    String name;
    int marks;

    public PriorityStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class JCF_PriorityQueueComparator {

    public static void main(String[] args) {

        // Comparator using Lambda
        // Higher marks = higher priority.
        // Integer.compare(s2.marks, s1.marks)
        // reverses the normal ascending order to give Higher marks → higher priority

        Comparator<PriorityStudent> byMarks =
                (s1, s2) -> Integer.compare(s2.marks, s1.marks);

        // Creating PriorityQueue with Comparator

        PriorityQueue<PriorityStudent> students = new PriorityQueue<>(byMarks);
        // The byMarks Comparator defines the priority rule.

        // Adding Student objects

        students.offer(new PriorityStudent("Rahul", 82));
        students.offer(new PriorityStudent("Aman", 95));
        students.offer(new PriorityStudent("Priya", 88));
        students.offer(new PriorityStudent("Neha", 76));

        // peek()
        // Shows the highest-priority student without removing.

        System.out.println("Highest Priority: " + students.peek());


        // poll()
        // Removes students according to priority.

        System.out.println("\nStudents by Priority:");

        while (!students.isEmpty()) {

            System.out.println(students.poll());
        }
    }
}