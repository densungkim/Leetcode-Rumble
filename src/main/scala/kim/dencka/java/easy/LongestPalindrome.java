package kim.dencka.java.easy;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd")); // 7
    }

    public static int longestPalindrome(String s) {
        int[] letters = new int[128];

        for (char ch : s.toCharArray()) {
            letters[ch]++;
        }

        int result = 0;
        boolean hasOdd = false;

        for (int letter : letters) {
            if (letter % 2 == 0) {
                result += letter;
            } else {
                result += (letter - 1);
                hasOdd = true;
            }
        }

        return hasOdd ? result + 1 : result;
    }
}
