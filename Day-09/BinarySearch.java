public class BinarySearch {
    public static int binarySearch (int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9, 15, 38, 43, 49, 65, 67, 81, 90};
        int key = 65;
        System.out.println(binarySearch(arr, key));
    }
}
