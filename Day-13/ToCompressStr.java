public class ToCompressStr {
    static String compressStr(String str) {

        //Using String
        // String newStr = "";
        // for (int i = 0; i < str.length(); i++) {
        //     Integer count = 1;//Cuz int wll gonna need to convert into String in output, Integer is used,
        //     while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        //         count++;
        //         i++;
        //     }
        //     newStr += str.charAt(i);
        //     if (count > 1) {
        //         newStr += count.toString();
        //     }
        // }

        //Using StringBuilder (for better performance)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressStr(str));
    }
}
