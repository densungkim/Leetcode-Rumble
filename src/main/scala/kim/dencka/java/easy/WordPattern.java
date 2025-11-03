package kim.dencka.java.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(ch)) charToWord.put(ch, word);
            if (!wordToChar.containsKey(word)) wordToChar.put(word, ch);

            if (!charToWord.get(ch).equals(word) || !wordToChar.get(word).equals(ch)) {
                return false;
            }

        }

        return true;
    }
}
