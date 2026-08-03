package JL01_basics;

import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User !");
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter The First Number : ");
        n1=sc.nextInt();
        System.out.print("Enter The Second Number : ");
        n2=sc.nextInt();
        int mul = n1*n2;
        System.out.print("The Multiplication of the Numbers : " + mul);
//        String str = sc.next();//Does not takes the words after the whitespace
//        String str_full = sc.nextLine();
//        System.out.println(str);
//        System.out.print(str_full);//Takes the full line input
        sc.close();
    }
}
