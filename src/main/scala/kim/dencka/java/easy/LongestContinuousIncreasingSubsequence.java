package kim.dencka.java.easy;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(nums)); // 3
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                max = Math.max(max, ++count);
            } else {
                count = 1;
            }
        }

        return max;
    }
}
