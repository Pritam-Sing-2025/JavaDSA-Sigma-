
import java.util.Arrays;

public class Test {
    // static String lowCaseVowelOccur(String str) {
    //     Integer count = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
    //             count++;
    //         }
    //     }
    //     return count.toString();
    // }
    // public static void main(String[] args) {
    //     String str = "Hi, My name is Varun";
    //     System.out.println(lowCaseVowelOccur(str));
    // }

    static boolean anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        System.out.println(anagram(str1, str2));
    }
}
