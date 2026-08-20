package JL07_oops;

// Created Custom Class with Attributes
class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.printf("%s's Id is : %d%n", name, id);
    }

    public int getSalary() {
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        // Instantiating new Employee Objects
        Employee devansh = new Employee();

        Employee rohit = new Employee();

        // Setting Attributes for Objects
        devansh.id = 101;
        devansh.name = "Devansh Bhatt";
        devansh.salary = 25000;


        rohit.id = 102;
        rohit.name = "Rohit Kushwaha";
        rohit.salary = 21000;


        // Printing The Attributes

//        System.out.println(Devansh.name);
//        System.out.println(Rohit.name);

        devansh.printDetails();

        rohit.printDetails();

        System.out.println(devansh.name + "'s Salary: " + devansh.getSalary());
        System.out.print(rohit.name + "'s Salary: " + rohit.getSalary());
    }
}