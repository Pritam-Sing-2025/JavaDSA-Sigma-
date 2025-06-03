public class SubArrMaxSumBruteF {

    //Using prefix sum
    // public static int subArrMaxSumBruteF (int[] arr){
    //     int sum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];
    //     prefix[0] = arr[0];
    //     for (int i = 1; i < prefix.length; i++) {
    //         prefix[i] = arr[i] + prefix[i - 1];
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         int start = i;
    //         sum = 0;
    //         for (int j = i; j < arr.length; j++) {
    //             int end = j;
    //             sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
    //             maxSum = Math.max (sum, maxSum);
    //         }
    //     }
    //     return maxSum;
    // }

    public static int subArrMaxSumBruteF (int[] arr){
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    maxSum = Math.max (sum, maxSum);
                }
            }
            return maxSum;
        }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println(subArrMaxSumBruteF(arr));
    }
}