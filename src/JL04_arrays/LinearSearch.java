package JL04_arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Element To Check For in The Array : ");
        int key = sc.nextInt();
        boolean flag=false;
        int[] arr = {11, 34, 67, 69, 55, 95, 63, 90};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                int pos = i + 1;
                System.out.printf("Element %d found at position %d.", key, pos);
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.print("Element Not Found in The Array.");
        }
        sc.close();
    }
}
