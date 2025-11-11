package kim.dencka.java.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(47, 85)); // [48,55,66,77]
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDivisible(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean selfDivisible(int n) {
        int x = n;
        while (x > 0) {
            int rem = x % 10;
            if (rem == 0 || n % rem != 0) return false;
            x /= 10;
        }

        return true;
    }
}
