package kim.dencka.java.easy;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String[] words = {"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord("1s3 456", words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String result = "################";
        int[] license = helper(licensePlate.toLowerCase());
        for (String word : words) {
            int[] cur = helper(word);
            boolean valid = true;
            for (int i = 0; i <= 25; i++) {
                if (license[i] > cur[i]) {
                    valid = false;
                    break;
                }
            }
            if (valid && result.length() > word.length()) result = word;
        }

        return result;
    }

    public static int[] helper(String target) {
        int[] letters = new int[26];
        for (int i = 0; i < target.length(); i++) {
            int ch = target.charAt(i) - 'a';
            if (ch >= 0 && ch <= 25) letters[ch]++;
        }

        return letters;
    }
}
