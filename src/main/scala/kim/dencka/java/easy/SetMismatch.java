package kim.dencka.java.easy;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums))); // [2, 3]
        System.out.println(Arrays.toString(findErrorNums2(nums))); // [2, 3]
    }

    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            arr[nums[i] - 1]++;
        }

        int[] result = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) result[0] = i + 1;
            if (arr[i] == 0) result[1] = i + 1;
        }

        return result;
    }

    public static int[] findErrorNums2(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;

        int duplicate = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) duplicate = nums[i];
        }

        int missing = expectedSum - actualSum + duplicate;
        return new int[]{duplicate, missing};
    }
}
