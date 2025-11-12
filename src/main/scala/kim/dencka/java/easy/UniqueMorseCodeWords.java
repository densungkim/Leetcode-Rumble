package kim.dencka.java.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words)); // 2
    }

    private static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(morse[word.charAt(i) - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}
