package JL08_multithreading;

// 1. A thread is the smallest unit of execution inside a process.
// 2. Java allows multiple threads to run concurrently.
// 3. To create a thread:
//        - Extend the Thread class.
//        - Override the run() method.
//        - Call start() to begin execution.
// start() creates a new thread and then calls run().
// Calling run() directly behaves like a normal method call.

class PositiveNumThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 51) {
            System.out.println(i);
            i++;
        }
    }
}

class NegativeNumThread extends Thread {
    @Override
    public void run() {
        int i = -1;
        while (i > -51) {
            System.out.println(i);
            i--;
        }
    }
}

public class ThreadBasics {
    public static void main(String[] args) {
        PositiveNumThread thread1 = new PositiveNumThread();
        NegativeNumThread thread2 = new NegativeNumThread();
//        thread1.run();
//        thread2.run(); ----> Normal Method Execution : first 1 to 50 print Then -1 to -50 print

        thread1.start();
        thread2.start();
//        start() begins a new thread.
//        Java's scheduler decides the execution order, so the output may be different every time.
    }
}