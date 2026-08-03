package JL01_basics;

public class OperatorsPrecedence_Associativity {
    public static void main(String[] args) {
        System.out.println(6*5-34/2);
        System.out.println(60/5-34/2);
        // Quadratic Formula
        int b =2;
        int a =3;
        int c =4;
        int d = (b*b - 4*a*c)/(2*a);
        System.out.println(d);
        int x = 7;
        int y = ++x * 8 ;
        System.out.println(y);
        // Character Increment
        char ch = 'a';
        System.out.println(++ch);
        char grade = 'B';
        // Encrypting The Grade
        grade = (char)(grade + 5);
        System.out.println(grade);
        // Decrypting The Grade
        grade = (char)(grade - 5);
        System.out.println(grade);
    }
}
