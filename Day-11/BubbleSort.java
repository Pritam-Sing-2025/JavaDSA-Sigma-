public class BubbleSort {
    //for increasing order sorting using Bubble Sort
    static void bubbleSortIncr (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //for decreasing order sorting using Bubble Sort
    // static void bubbleSortDesc (int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         boolean isSorted = true;
    //         for (int j = 0; j < n - 1 - i; j++) {
    //             if (arr[j] < arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //                 isSorted = false;
    //             }
    //         }
    //         if (isSorted) break;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSortIncr(arr);
        // bubbleSortDesc(arr);
    }
}
