package JL08_multithreading;

class Task extends Thread {

    public Task(String name) {
        super(name);
    }

    @Override
    public void run() {

        // Prints the name and priority of the currently executing thread.
        System.out.println(
                Thread.currentThread().getName()
                        + " | Priority: "
                        + Thread.currentThread().getPriority()
        );

        for (int i = 1; i <= 25; i++) {
            System.out.println(
                    Thread.currentThread().getName()
                            + " is working - Step " + i
            );
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {

        Task lowPriority = new Task("Low Priority Thread");
        Task normalPriority = new Task("Normal Priority Thread");
        Task highPriority = new Task("High Priority Thread");

//         Thread priority ranges from 1 to 10, Java provides three commonly used priority constants:
//          MIN_PRIORITY    = 1
//          NORM_PRIORITY   = 5 ( Default Priority For a Thread )
//          MAX_PRIORITY    = 10

        lowPriority.setPriority(Thread.MIN_PRIORITY);
        normalPriority.setPriority(Thread.NORM_PRIORITY);
        highPriority.setPriority(Thread.MAX_PRIORITY);

        // getPriority() returns the current priority of a thread.
        System.out.println(
                lowPriority.getName() + " Priority: "
                        + lowPriority.getPriority()
        );

        System.out.println(
                normalPriority.getName() + " Priority: "
                        + normalPriority.getPriority()
        );

        System.out.println(
                highPriority.getName() + " Priority: "
                        + highPriority.getPriority()
        );

        System.out.println("\n--- Starting Threads ---");

        // Higher priority gives a thread higher scheduling preference, but does not guarantee execution order.
        lowPriority.start();
        normalPriority.start();
        highPriority.start();
    }
}