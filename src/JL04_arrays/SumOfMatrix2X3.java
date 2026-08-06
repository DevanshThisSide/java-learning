package JL04_arrays;

public class SumOfMatrix2X3 {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};

        int[][] mat2 = {{3, 2, 1},
                {6, 5, 4}};

        int[][] sum = new int[2][3];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}