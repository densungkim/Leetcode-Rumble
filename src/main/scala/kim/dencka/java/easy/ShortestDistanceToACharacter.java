package kim.dencka.java.easy;

import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e'))); // [3,2,1,0,1,0,0,1,2,2,1,0]
    }

    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        int last = Integer.MIN_VALUE / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) last = i;
            result[i] = i - last;
        }

        last = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) last = i;
            result[i] = Math.min(result[i], last - i);
        }

        return result;
    }
}
