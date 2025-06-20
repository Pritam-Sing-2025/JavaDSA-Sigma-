



public class LinearSearchLarge2DArr {
    static int linearSearchLarge (int[][] arr) {
        int maxNum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxNum) {
                    maxNum = arr[i][j];
                }
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {23, 40, 17},
            {87, 29, 68, 5},
            {12, 73, 32}, 
            {28, 77}
        };
        int ans = linearSearchLarge(arr);
        System.out.println(ans);
    }
}
