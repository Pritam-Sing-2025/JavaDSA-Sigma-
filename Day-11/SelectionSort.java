

public class SelectionSort {
    // By finding smaller elements
    static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[maxPos]) {
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // By finding larger elements
    // static void selectionSort2 (int[] arr) {
    //     for (int i = arr.length - 1; i > 0; i--) {
    //         int maxPos = 0;
    //         for (int j = 1; j <= i; j++) {
    //             if (arr[j] > arr[maxPos]) {
    //                 maxPos = j;
    //             }
    //         }
    //         int temp = arr[maxPos];
    //         arr[maxPos] = arr[i];
    //         arr[i] = temp;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        selectionSort(arr);
        // selectionSort2(arr);
    }
}
