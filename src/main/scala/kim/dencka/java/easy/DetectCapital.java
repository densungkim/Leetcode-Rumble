package kim.dencka.java.easy;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG")); // false
        System.out.println(detectCapitalUse2("FlaG")); // false
    }

    public static boolean detectCapitalUse(String word) {
        boolean allLowerCase = word.equals(word.toLowerCase());
        boolean allUpperCase = word.equals(word.toUpperCase());
        boolean capitalized = Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());

        return allLowerCase || allUpperCase || capitalized;
    }

    public static boolean detectCapitalUse2(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) count++;
        }

        return count == word.length() || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
