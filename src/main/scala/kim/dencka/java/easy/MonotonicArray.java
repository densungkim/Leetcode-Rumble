package kim.dencka.java.easy;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3})); // true
    }

    public static boolean isMonotonic(int[] nums) {
        boolean isInc = true, isDec = true;
        for (int i = 1; i < nums.length; i++) {
            if (!isInc && !isDec) return false;

            if (nums[i] < nums[i - 1]) isInc = false;
            if (nums[i] > nums[i - 1]) isDec = false;
        }

        return isInc || isDec;
    }
}
