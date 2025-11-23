package kim.dencka.java.easy;

import java.util.Arrays;

public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz"))); // [3,60]
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = widths[s.charAt(i) - 'a'];

            if (sum + num > 100) {
                lines++;
                sum = num;
            } else {
                sum += num;
            }
        }

        return new int[]{lines, sum};
    }
}
