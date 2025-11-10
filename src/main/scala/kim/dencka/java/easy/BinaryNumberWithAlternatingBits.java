package kim.dencka.java.easy;

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5)); // true
        System.out.println(hasAlternatingBits2(5)); // true
    }

    public static boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }

    public static boolean hasAlternatingBits2(int n) {
        int x = -1;
        while (n != 0) {
            boolean isOne = (n & 1) == 1;
            if ((isOne && x == 1) || (!isOne && x == 0)) {
                return false;
            } else {
                x = isOne ? 1 : 0;
            }
            n >>>= 1;
        }

        return true;
    }
}
