package kim.dencka.java.easy;

public class BuddyString {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba")); // true
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        int n = s.length();
        if (s.equals(goal)) {
            int[] letters = new int[26];
            for (char ch : s.toCharArray()) {
                if (letters[ch - 'a'] > 0) return true;
                else letters[ch - 'a']++;
            }
            return false;
        }

        char[] arrS = s.toCharArray(), arrGoal = goal.toCharArray();
        int l = 0, r = n - 1;

        while (l < r && arrS[l] == arrGoal[l]) l++;
        while (r >= 0 && arrS[r] == arrGoal[r]) r--;

        if (l < r) {
            char temp = arrS[l];
            arrS[l] = arrS[r];
            arrS[r] = temp;
            s = new String(arrS);
        }

        return s.equals(goal);
    }
}
