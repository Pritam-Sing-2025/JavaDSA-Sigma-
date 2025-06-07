public class InsertionSort {
    static void insertionSort (int[] arr) {
        //Shraddha's
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Kunal's
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j > 0; j--) {
        //         if (arr[j] < arr[j - 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j - 1];
        //             arr[j - 1] = temp;
        //         }
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        insertionSort(arr);
    }
}