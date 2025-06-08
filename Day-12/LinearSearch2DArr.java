
import java.util.Arrays;

public class LinearSearch2DArr {
    static int[] linearSearch(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {23, 40, 17},
            {87, 29, 68, 5},
            {12, 73, 32}, 
            {28, 77}
        };
        int key = 68;
        int[] ans = linearSearch(arr, key);
        System.out.println(Arrays.toString(ans));
    }
}
