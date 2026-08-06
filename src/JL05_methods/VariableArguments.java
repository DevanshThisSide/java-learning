package JL05_methods;

//VarArgs (...) allow a method to accept any number of arguments of the same type.
//Inside the method, varargs are treated as an array.
//Only one varargs parameter is allowed in a method.
//Varargs must always be the last parameter in the parameter list.
//Use varargs when the number of arguments is unknown or variable.
public class VariableArguments {
    static double average(int... arr) { // Can force it to run for atleast one argument by using (int x , int ... arr)
        // Available as int [] arr
        int sum = 0;
        if (arr.length == 0) { // Because for no arguments 0.0/0.0 ---> NaN ( Not a Number )
            return 0;
        }
        for (int ele : arr) {
            sum += ele;
        }
        return sum / (double) arr.length;
    }

    public static void main(String[] args) {
        System.out.printf("Average for No Arguments is : %.2f%n", average());
        System.out.printf("Average Of Only 10 is : %.2f%n", average(10));
        System.out.printf("Average Of 10, 20 is : %.2f%n", average(10, 20));
        System.out.printf("Average Of 10, 20, 30 is : %.2f%n", average(10, 20, 30));
        System.out.printf("Average Of 10, 20, 30, 40 is : %.2f%n", average(10, 20, 30, 40));
        System.out.printf("Average Of 10, 20, 30, 40, 50 is : %.2f", average(10, 20, 30, 40, 50));
    }
}
