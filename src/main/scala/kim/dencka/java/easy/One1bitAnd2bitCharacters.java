package kim.dencka.java.easy;

public class One1bitAnd2bitCharacters {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(nums)); // false
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
