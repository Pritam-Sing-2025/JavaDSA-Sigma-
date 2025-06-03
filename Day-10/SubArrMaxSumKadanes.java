public class SubArrMaxSumKadanes {

    //It returns zero even when the max sum is -ve
    // public static int subArrMaxSumKadanes (int[] arr) {
    //     int sum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //         if (sum < 0) {
    //             sum = 0;
    //         }
    //         maxSum = Math.max(sum, maxSum);
    //     }
    //     return maxSum;
    // }

    //More optimized
    //It returns the -ve sums too
    public static int subArrMaxSumKadanes (int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -4, -6, -8, -10};
        System.out.println(subArrMaxSumKadanes(arr));
    }
}
