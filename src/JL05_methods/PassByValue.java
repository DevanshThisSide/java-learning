package JL05_methods;
// Java is always Pass by Value.
public class PassByValue {
    static void changeValue(int x) {
        x = 69;
    }

    static void changeArrValue(int[] arr) { // For objects, the value being passed is a copy of the reference, not the object itself.
        arr[0] = 69; // Modifying an object's contents inside a method affects the original object.
    }

    public static void main(String[] args) {
        // Primitive variables are passed by value (a copy of the value is passed).
        int a = 0;
        changeValue(a);
        System.out.print("Value of variable after function call : " + a);
        // For objects/arrays, Java passes a copy of the reference.
        // Both references point to the same object, so object changes are visible.
        int[] array = {2, 4, 6, 8};
        changeArrValue(array);
        System.out.print("\nValue of first element of array after function call : " + array[0]);
    }
}
