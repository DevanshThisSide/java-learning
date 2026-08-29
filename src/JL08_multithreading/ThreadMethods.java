package JL08_multithreading;

// Demonstrates commonly used Thread methods such as join(), isAlive(), setName(), getName(), getState() and sleep().

class ProcessTask extends Thread {

    public ProcessTask(String name) {
        super(name);
    }

    @Override
    public void run() {

        // currentThread() returns the thread that is currently executing.
        Thread current = Thread.currentThread();

        for (int i = 1; i <= 15; i++) {

            System.out.println(
                    current.getName() + " - Step " + i
            );

            try {
                // sleep() temporarily pauses the currently executing thread.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(current.getName() + " was interrupted.");
            }
        }

        System.out.println(current.getName() + " completed.");
    }
}

public class ThreadMethods {

    public static void main(String[] args) {
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        ProcessTask task1 = new ProcessTask("Task-1");
        ProcessTask task2 = new ProcessTask("Task-2");

        // setName() changes the name of an existing thread.
        task1.setName("Download-Task");
        task2.setName("Upload-Task");

        // getName() returns the current name of the thread.
        System.out.println("Thread 1: " + task1.getName());
        System.out.println("Thread 2: " + task2.getName());

        // isAlive() checks whether a thread has started and has not yet terminated.
        System.out.println("Before start:");
        System.out.println("Task 1 Alive: " + task1.isAlive());
        System.out.println("Task 2 Alive: " + task2.isAlive());

        // getState() returns the current lifecycle state of a thread,
        // such as NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING or TERMINATED.
        // getState() returns the current state of the thread as Thread.State value.
        System.out.println("Task 1 State: " + task1.getState());
        System.out.println("Task 2 State: " + task2.getState());

        // start() starts both threads.
        // start() creates separate threads, allowing Task 1 and Task 2 to execute concurrently
        // while the main thread continues until it reaches join().
        task1.start();
        task2.start();

        // isAlive() can now return true because the threads are executing.
        System.out.println("After start:");
        System.out.println("Task 1 Alive: " + task1.isAlive());
        System.out.println("Task 2 Alive: " + task2.isAlive());

        // Threads are now normally RUNNABLE, although the exact state can change
        // immediately because thread scheduling happens concurrently.
        System.out.println("Task 1 State: " + task1.getState());
        System.out.println("Task 2 State: " + task2.getState());

        try {
            // main() executes on the main thread; join() makes the calling main thread wait
            // until the specified thread finishes, while other threads can continue running.
//              join() makes the main thread wait until task1 finishes.
//              The main thread does not continue past this point until task1 has terminated.
            task1.join();
            System.out.println("Task 1 has finished.");
//              main thread now waits for task2 to finish.
            task2.join();
            System.out.println("Task 2 has finished.");

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        // join() blocks the calling thread (here, main) until the target thread terminates.

        // Both threads have finished at this point.
        System.out.println("After join:");
        System.out.println("Task 1 Alive: " + task1.isAlive());
        System.out.println("Task 2 Alive: " + task2.isAlive());

        // Both threads have completed, so their state is TERMINATED.
        System.out.println("Task 1 State: " + task1.getState());
        System.out.println("Task 2 State: " + task2.getState());

        System.out.print("Main thread completed.");
    }
}
//          JVM
//           │
//           └── Main Thread
//           │
//           ├── creates Task 1
//           ├── creates Task 2
//           ├── starts Task 1
//           └── starts Task 2

//                    JVM
//                     │
//        ┌────────────┼────────────┐
//        ↓            ↓            ↓
//    Main Thread   Download-Task  Upload-Task
//        │
//        │
//        └── executes main()

//      Main Thread
//           │
//           │ task1.join()
//           ↓
//         WAITING
//           │
//           │
//           ├──────── Download-Task → continues running
//           │
//           └──────── Upload-Task   → continues running

// If we place task1.join() before task2.start(), Then Task 2 would wait for Task 1 until it finished.