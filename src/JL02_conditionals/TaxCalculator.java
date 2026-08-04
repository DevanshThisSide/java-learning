package JL02_conditionals;//        | Annual Income       | Tax Rate |
//        | ------------------- | -------: |
//        | Up to ₹2.5 lakh     |       0% |
//        | ₹2.5 lakh – ₹5 lakh |       5% |
//        | ₹5 lakh – ₹10 lakh  |      20% |
//        | Above ₹10 lakh      |      30% |

import java.util.Scanner;

class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income in Lakhs per Annum : ");
        float income = sc.nextFloat();
        float tax = 0f;
        if (income <= 2.5f) {
            tax += 0f;
        } else if (income > 2.5f && income <= 5.0f) {
            tax += (income - 2.5f) * 0.05f;
        } else if (income > 5.0f && income <= 10.0f) {
            tax += (5.0f - 2.5f) * 0.05f;
            tax += (income - 5f) * 0.2f;
        } else {
            tax += (5.0f - 2.5f) * 0.05f;
            tax += (10.0f - 5.0f) * 0.2f;
            tax += (income - 10.0f) * 0.3f;
        }
        System.out.printf("Total Tax to Pay in Lakhs is : %.4f", tax);
        sc.close();
    }
}
