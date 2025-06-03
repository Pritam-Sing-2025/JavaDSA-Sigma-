public class SubArrMaxSumNormal {
    public static int subArrMaxSum (int[] arr) {
        // int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []arr = {2, 4, 6, 8, 10};
        int ans = subArrMaxSum(arr);
        System.out.println(ans);
    }
}
