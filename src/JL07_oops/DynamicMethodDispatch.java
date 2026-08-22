package JL07_oops;

// * Dynamic Method Dispatch is a mechanism through which an overridden
// * method is called at runtime based on the actual object.
// * This is also called Runtime Polymorphism.

class Phone {

    public void phoneMsg() {
        System.out.println("This is Phone.");
    }

    public void on() {
        System.out.println("Turning ON Phone......");
    }
}

class SmartPhone extends Phone {

    public void smartPhoneMsg() {
        System.out.println("This is SmartPhone.");
    }

    //  SmartPhone overrides the on() method of Phone.
    @Override
    public void on() {
        System.out.println("Turning ON SmartPhone......");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        // Parent reference + Parent object
        // Both methods belong to Phone.
        // Phone phone = new Phone();
        // phone.phoneMsg();
        // phone.on();


        // Child reference + Child object
        // SmartPhone can access its own methods as well as
        // inherited methods from Phone.
        // SmartPhone smartPhone = new SmartPhone();
        // smartPhone.smartPhoneMsg();
        // smartPhone.on();
        // smartPhone.phoneMsg();

        /*
         * Parent reference + Child object
         * Phone obj = new SmartPhone();
         *
         * Reference type  → Phone
         * Actual object   → SmartPhone
         *
         * The reference type determines which methods can be accessed.
         * The actual object determines which overridden method is executed.
         */
        Phone obj = new SmartPhone();

        // Both Phone and SmartPhone have on().
        // Since the actual object is SmartPhone,
        // SmartPhone's overridden on() executes.
        obj.on();

        // phoneMsg() is inherited from Phone and is not overridden,
        // so Phone's implementation executes.
        obj.phoneMsg();

        /*
         * NOT ALLOWED:
         * obj.smartPhoneMsg();
         *
         * Although the actual object is SmartPhone,
         * the reference type is Phone.
         *
         * Phone does not know about smartPhoneMsg().
         */
    }
}