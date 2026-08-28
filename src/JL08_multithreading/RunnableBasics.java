package JL08_multithreading;

//  Runnable is another way of creating tasks that can be executed by a thread.
//  Runnable defines the TASK, while the Thread object is responsible for executing that task concurrently.

class PizzaOrder implements Runnable {

    @Override
    public void run() {

        System.out.println("Pizza order received.");

        System.out.println("Preparing dough...");
        pause();

        System.out.println("Rolling dough...");
        pause();

        System.out.println("Adding pizza sauce...");
        pause();

        System.out.println("Adding cheese...");
        pause();

        System.out.println("Adding toppings...");
        pause();

        System.out.println("Baking pizza...");
        pause();

        System.out.println("Packing pizza...");
        pause();

        System.out.println("Pizza is ready.");
    }

    private void pause() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Pizza thread interrupted.");
        }
    }
}

class BurgerOrder implements Runnable {

    @Override
    public void run() {

        System.out.println("Burger order received.");

        System.out.println("Preparing bun...");
        pause();

        System.out.println("Preparing patty...");
        pause();

        System.out.println("Grilling patty...");
        pause();

        System.out.println("Adding vegetables...");
        pause();

        System.out.println("Adding cheese...");
        pause();

        System.out.println("Adding sauces...");
        pause();

        System.out.println("Assembling burger...");
        pause();

        System.out.println("Packing burger...");
        pause();

        System.out.println("Burger is ready.");
    }

    private void pause() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Burger thread interrupted.");
        }
    }
}

public class RunnableBasics {

    public static void main(String[] args) {

//          Creating Runnable objects.
//          These objects represent the TASKS.
//          They are not threads by themselves.
        PizzaOrder pizza = new PizzaOrder();
        BurgerOrder burger = new BurgerOrder();

//          Creating Thread objects and passing the Runnable objects to their constructors.
//          Thread will execute the run() method of the corresponding Runnable object.
        Thread thread1 = new Thread(pizza);
        Thread thread2 = new Thread(burger);

//          start() starts separate threads.
//          The two orders can now execute concurrently.
//          Therefore, the exact order of output is not guaranteed.
        thread1.start();
        thread2.start();
    }
}
//  Thread.sleep() pauses the currently executing thread for the specified time in milliseconds.
//  It does NOT stop the other threads. While one thread is sleeping,
//  another thread can continue execution.
//  sleep() is useful for observing and controlling timing in multithreaded programs,
//   but it does not guarantee a specific execution order.