package JL04_arrays;

public class AvgOfArray {
    public static void main(String[] args) {

        float[] phy_marks = {68.5f, 78.3f, 88.6f, 90.0f, 93.67f};
        float sum = 0f;
        for (float elem : phy_marks) {
            sum += elem;
        }
        float avg=sum/phy_marks.length;
        System.out.printf("The Average Marks in Physics is : %.2f",avg);
    }
}
