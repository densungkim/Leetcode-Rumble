package kim.dencka.java.easy;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(nums)); // 5
    }

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);

        int l = 0, maxLen = 0;
        for (int r = 0; r < nums.length; r++) {
            while (nums[r] - nums[l] > 1) l++;

            if (nums[r] - nums[l] == 1) maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
