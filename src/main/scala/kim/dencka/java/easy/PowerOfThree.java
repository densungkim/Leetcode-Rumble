package kim.dencka.java.easy;

/**
 * Exponentiation by squaring - быстрое возведение в степень.
 * <p>
 * {@code ./resources/exponentiation-by-squaring.png}
 */
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27)); // true
        System.out.println(isPowerOfThree(45)); // false

        System.out.println(isPowerOfThreeLoop(27)); // true
        System.out.println(isPowerOfThreeLoop(45)); // false
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static boolean isPowerOfThreeLoop(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }
}
