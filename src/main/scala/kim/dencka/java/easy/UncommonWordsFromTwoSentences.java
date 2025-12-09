package kim.dencka.java.easy;

import java.util.*;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }

    public static String[] uncommonFromSentences(String A, String B) {
        String[] words = (A + " " + B).split(" ");

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) result.add(entry.getKey());
        }

        return result.toArray(new String[0]);

    }
}
