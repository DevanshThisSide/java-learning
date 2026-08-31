package JL09_errors_exceptions;
import java.util.Scanner;

// Custom checked exception for invalid or unavailable delivery slots.
class DeliverySlotUnavailableException extends Exception {
        // Exception Class Methods:
            // getMessage() → Returns only the exception message.
            // toString() → Returns the exception class name along with its message.
            // printStackTrace() → Prints the exception details along with the exact location
            // where the exception occurred and the method-call path.
    public DeliverySlotUnavailableException(String errorMessage) {
        super(errorMessage);
    }
}

public class ThrowsDeliverySlotAvailability {

    // Private instance variable protects the available slots from direct access.
    private int availableSlots;

    // Constructor initializes the available delivery slots.
    public ThrowsDeliverySlotAvailability(int availableSlots) {
        this.availableSlots = availableSlots;
    }

    //     'throws' declares that this method may pass DeliverySlotUnavailableException to its caller.
    //      The method does not handle the exception itself.
    //      The responsibility of handling it is transferred to the caller.

    // Exception propagation occurs when an unhandled exception moves up the method-call stack
    // until a suitable catch block handles it.
        //      If an exception occurs here and is not handled by this method,
        //      'throws' allows it to propagate to the caller.
        //      In this program, main() receives and handles the exception.
    public void reserveSlot(int requestedSlots)
            throws DeliverySlotUnavailableException {

        if (requestedSlots <= 0 || requestedSlots > availableSlots) {

            // Manually throw the custom exception when the request is invalid.
            throw new DeliverySlotUnavailableException("Invalid number of delivery slots requested.");
        }

        availableSlots -= requestedSlots;

        System.out.println("Delivery slots reserved successfully.");
        System.out.println("Remaining Slots : " + availableSlots);
    }

    public static void main(String[] args) {
        // Create a delivery system with 3 available slots.
        ThrowsDeliverySlotAvailability delivery = new ThrowsDeliverySlotAvailability(3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Slots : " + delivery.availableSlots);

        System.out.print("Enter how many delivery slots you want to reserve : ");
        int requestedSlots = sc.nextInt();

        try {
            // reserveSlot() declares the exception using 'throws', so the caller must handle or further declare it.
                // The exception is thrown in reserveSlot() and propagates to main(),
                // where the catch block finally handles it.
            delivery.reserveSlot(requestedSlots);

        } catch (DeliverySlotUnavailableException exception) {
            // Handles the exception passed from reserveSlot().
            System.out.println("Reservation failed.");
            System.out.println("Reason : " + exception.getMessage());

        } finally {
            System.out.print("Order reservation process completed.");
            sc.close();
        }
    }
}