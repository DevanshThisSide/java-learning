package JL02_conditionals;

import java.util.Scanner;

//        | **Slab Range (Units)**       | **Rate per Unit (₹)** |
//        | ---------------------------- | --------------------: |
//        | First **100** units (0–100)  |                 ₹4.50 |
//        | Next **200** units (101–300) |                 ₹6.00 |
//        | Next **200** units (301–500) |                 ₹8.50 |
//        | Above **500** units (>500)   |                ₹11.00 |

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed : ");
        int unit = sc.nextInt();
        float billAmount = 0f;
        if (unit<0){
            System.out.print("Enter Valid Unit Count.");
            return;
        }
        if (unit >= 0 && unit <= 100) {
            billAmount += unit * 4.5f;
        } else if (unit >= 101 && unit <= 300) {
            billAmount += 100 * 4.5f;
            billAmount += (unit - 100) * 6f;
        } else if (unit >= 301 && unit <= 500) {
            billAmount += 100 * 4.5f;
            billAmount += (300 - 100) * 6f;
            billAmount += (unit - 300) * 8.5f;
        } else {
            billAmount += 100 * 4.5f;
            billAmount += (300 - 100) * 6f;
            billAmount += (500 - 300) * 8.5f;
            billAmount += (unit - 500) * 11f;
        }
        float surcharge = billAmount * 0.10f;
        System.out.printf("The surcharge on the bill is : ₹%.2f%n", surcharge);
        float totalBill = billAmount + surcharge;
        System.out.printf("The Total Amount to be Paid is : ₹%.2f", totalBill);

        sc.close();
    }
}
