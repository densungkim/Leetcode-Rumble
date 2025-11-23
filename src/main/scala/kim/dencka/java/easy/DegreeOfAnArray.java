package kim.dencka.java.easy;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums)); // 6
    }

    public static int findShortestSubArray(int[] nums) {
        int max = -1;
        for (int num : nums) max = Math.max(max, num);

        int[] freq = new int[max + 1];
        int[] lefts = new int[max + 1];
        int[] rights = new int[max + 1];

        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (++freq[num] == 1) lefts[num] = i;
            rights[num] = i;
            maxCount = Math.max(maxCount, freq[num]);
        }

        int minLen = Integer.MAX_VALUE;
        for (int n = 0; n <= max; n++) {
            if (freq[n] == maxCount) {
                minLen = Math.min(minLen, rights[n] - lefts[n] + 1);
            }
        }

        return minLen;
    }
}
