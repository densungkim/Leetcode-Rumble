package kim.dencka.java.easy;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String[] banned = {"hit"};
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned)); // ball
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split("[ !?',;.]+");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            String lowered = word.toLowerCase();
            if (!contains(banned, lowered)) {
                map.put(lowered, map.getOrDefault(lowered, 0) + 1);
            }
        }

        String ans = "";
        for (String key : map.keySet()) {
            if (map.get(key) >= map.getOrDefault(ans, 0)) {
                ans = key;
            }
        }

        return ans;
    }

    public static boolean contains(String[] banned, String target) {
        for (String word : banned) {
            if (word.toLowerCase().equals(target)) return true;
        }

        return false;
    }
}
