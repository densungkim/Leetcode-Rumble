package kim.dencka.java.easy;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcabcab", 3));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int start = 0; start < chars.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, chars.length - 1);
            while (i < j) {
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }

        return new String(chars);
    }
}
