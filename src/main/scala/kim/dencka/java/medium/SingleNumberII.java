package kim.dencka.java.medium;

import java.util.Arrays;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2}; // 3
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, n = nums.length;
        while (i < n - 1) {
            if (nums[i] == nums[i + 1]) {
                i += 3;
            } else {
                return nums[i];
            }
        }

        return nums[n - 1];
    }
}
