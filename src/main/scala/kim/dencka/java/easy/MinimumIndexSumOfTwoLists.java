package kim.dencka.java.easy;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"happy", "sad", "good"};
        String[] list2 = {"sad", "happy", "good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2))); // [sad, happy]
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);

        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (i > min) break;
            String key = list2[i];
            if (map.containsKey(key)) {
                int a = map.get(key);
                if (a + i <= min) {
                    if (a + i < min) result.clear();
                    result.add(key);
                    min = a + i;
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
