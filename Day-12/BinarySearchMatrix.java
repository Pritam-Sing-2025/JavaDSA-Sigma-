
import java.util.Arrays;

public class BinarySearchMatrix {
    public static int[] binarySearchMatrix (int[][] matrix, int key) {
        // //1. Special cell ==> matrix[0][matrix[0].length - 1] ==> (0, m-1)
        // int row = 0;
        // int col = matrix[0].length - 1;
        // while (row < matrix.length && col >= 0) {
        //     if (key == matrix[row][col]) {
        //         return new int[]{row, col};
        //     }
        //     else if (key > matrix[row][col]) {
        //         row++;
        //     } else {
        //         col--;
        //     }
        // }

        //2. Special cell ==> matrix[matrix.length - 1][0] ==> (n-1, 0)
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                return new int[] {row, col};
            } 
            else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] matrix=  {
            {10, 20, 30, 40}, 
            {15, 25, 35, 45},
            {27, 29, 37, 48}, 
            {32, 33, 39, 50}
        };
        int key = 10;
        int[] ans = binarySearchMatrix(matrix, key);
        System.out.println(Arrays.toString(ans));
    }
}
