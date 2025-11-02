package kim.dencka.java.easy;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba")); // true
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] ss = new int[256];
        int[] tt = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (ss[charS] != tt[charT]) return false;

            ss[charS] = i + 1;
            tt[charT] = i + 1;
        }

        return true;
    }
}
