package kim.dencka.java.easy;

public class NimGame {
    public static void main(String[] args) {
        System.out.println(canWinNim(4)); // false
        System.out.println(canWinNim(2)); // true
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
