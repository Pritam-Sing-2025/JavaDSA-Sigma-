public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {13, 59, 30, 43, 69, 75, 27};
        int key = 43;
        System.out.println(linearSearch(arr, key));
    }
}