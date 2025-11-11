package kim.dencka.java.easy;

import java.util.Arrays;

public class DesignHashMap {
    public static void main(String[] args) {
        var map = new MyHashMap();
        map.put(1, 100);
        map.put(2, 200);
        System.out.println(map.get(2)); // 200
        map.remove(2);
        System.out.println(map.get(2)); // -1
    }

    static class MyHashMap {
        private final int[] values;

        public MyHashMap() {
            values = new int[1_000_001];
            Arrays.fill(values, -1);
        }

        public void put(int key, int value) {
            values[key] = value;
        }

        public int get(int key) {
            return values[key];
        }

        public void remove(int key) {
            values[key] = -1;
        }
    }
}
