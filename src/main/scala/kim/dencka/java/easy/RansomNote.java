package kim.dencka.java.easy;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab")); // true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        char[] note = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        int[] count = new int[26];
        for (char c : mag) {
            count[c - 'a']++;
        }

        for (char c : note) {
            if (count[c - 'a'] <= 0) return false;
            count[c - 'a']--;
        }

        return true;
    }
}
