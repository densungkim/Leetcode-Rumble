package kim.dencka.java.easy;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    public static void main(String[] args) {
        var kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));  // 4
        System.out.println(kthLargest.add(5));  // 5
        System.out.println(kthLargest.add(10)); // 5
        System.out.println(kthLargest.add(9));  // 8
        System.out.println(kthLargest.add(4));  // 8
    }

    static class KthLargest {
        private final PriorityQueue<Integer> minHeap;
        private final int k;

        public KthLargest(int k, int[] nums) {
            this.minHeap = new PriorityQueue<>();
            this.k = k;
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            if (minHeap.size() < k || minHeap.peek() < val) {
                minHeap.add(val);
                if (minHeap.size() > k) minHeap.remove();
            }
            return minHeap.peek();
        }
    }
}
