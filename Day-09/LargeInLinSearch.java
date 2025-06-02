public class LargeInLinSearch {
    public static int largLinearSearch (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {71, 54, 59, 16, 89, 40, 79};
        System.out.println(largLinearSearch(arr));
    }
}
