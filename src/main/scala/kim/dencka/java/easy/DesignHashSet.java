package kim.dencka.java.easy;

public class DesignHashSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 2, 2};
        var set = new MyHashSet(nums);
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(2)); // true
        set.remove(2);
        System.out.println(set.contains(2)); // false
    }

    static class MyHashSet {
        private final boolean[] elements;

        public MyHashSet(int[] nums) {
            elements = new boolean[1_000_001];
            for (int num : nums) elements[num] = true;
        }

        public void add(int key) {
            elements[key] = true;
        }

        public void remove(int key) {
            elements[key] = false;
        }

        public boolean contains(int key) {
            return elements[key];
        }
    }
}
