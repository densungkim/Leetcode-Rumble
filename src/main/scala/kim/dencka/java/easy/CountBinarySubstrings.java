package kim.dencka.java.easy;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011")); // 6
    }

    public static int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int cur = 1, prev = 0, result = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                cur++;
            } else {
                result += Math.min(cur, prev);
                prev = cur;
                cur = 1;
            }
        }

        return result + Math.min(cur, prev);
    }
}
