package JL07_oops;

// UPCASTING:
//  Child object -> Parent reference
//  Upcasting is automatic because a child object is also considered an object of its parent class.
// DOWN CASTING:
//  Parent reference -> Child reference
//  Down casting requires explicit casting.
//  Down casting is safe only when the actual object referred to by the parent reference belongs to that child class.

class Animal {

    public void sound() {
        System.out.println("Animal is making sound.");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog is barking.");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

}


public class UpAndDownCasting {

    public static void main(String[] args) {

//        ---------------- UPCASTING ----------------
//         Dog object is assigned to an Animal reference.
        Animal animal = new Dog();

        // sound() is available through Animal reference.
        // Since Dog overrides sound, Dog's version executes.
        animal.sound();

//          animal.bark();
//          NOT ALLOWED because bark() belongs specifically to Dog and is not declared in Animal.

//         ---------------- DOWN CASTING ----------------
//          The actual object inside 'animal' is a Dog.
//          Therefore, it can safely be converted back to a Dog reference.
        Dog dog = (Dog) animal;

        // Now Dog-specific methods can be accessed.
        dog.eat();
        dog.sound();

//         ---------------- SAFE DOWN CASTING ----------------
//            instanceof checks whether the actual object is an instance of Dog before performing the cast.

        if (animal instanceof Dog) {
            Dog safeDog = (Dog) animal;
            safeDog.sound();
        }
    }
}