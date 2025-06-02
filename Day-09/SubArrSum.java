public class SubArrSum {
    public static void subArrSum (int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        subArrSum(arr);
    }
}
