package JL08_multithreading;

// Demonstrates Thread constructors, Runnable, start(), run(), currentThread(), getId() and getName().

class SimpleTask extends Thread {

    // Default constructor; super() calls the Thread() constructor.
    public SimpleTask() {
        super();
    }

    // Constructor with a name; super(name) calls Thread(String name).
    public SimpleTask(String name) {
        super(name);
    }

    // run() contains the task executed by this thread.
    @Override
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

// Runnable task used with Thread(Runnable) and Thread(Runnable, String).
class DownloadTask implements Runnable {

    // run() contains the task that will be executed by the Thread.
    @Override
    public void run() {
        System.out.println("Download started by: " + Thread.currentThread().getName());
        System.out.println("Downloading file...");
        System.out.println("Download completed by: " + Thread.currentThread().getName());
    }
}

public class ThreadConstructors {

    public static void main(String[] args) {

        // 1. Thread() → creates a thread using the no-argument Thread constructor.
        SimpleTask thread1 = new SimpleTask();

        // 2. Thread(Runnable target) → creates a thread with a Runnable task.
        DownloadTask downloadTask = new DownloadTask();
        Thread thread2 = new Thread(downloadTask);

        // 3. Thread(String name) → creates a thread with a custom name.
        SimpleTask thread3 = new SimpleTask("BackupThread");

        // 4. Thread(Runnable target, String name) → creates a thread with a task and custom name.
        Thread thread4 = new Thread(downloadTask, "DownloadThread");

        // getId() and getName() returns the unique ID assigned to the thread by the JVM and name assigned to the thread.
        System.out.println("Thread 1 Name: " + thread1.getName());
        System.out.println("Thread 1 Id: " + thread1.getId());
        System.out.println("Thread 2 Name: " + thread2.getName());
        System.out.println("Thread 2 Id: " + thread2.getId());
        System.out.println("Thread 3 Name: " + thread3.getName());
        System.out.println("Thread 3 Id: " + thread3.getId());
        System.out.println("Thread 4 Name: " + thread4.getName());
        System.out.println("Thread 4 Id: " + thread4.getId());

        System.out.println("\n--- Starting Threads ---");

        // start() creates a new thread and executes its run() method; execution order is not guaranteed.
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}