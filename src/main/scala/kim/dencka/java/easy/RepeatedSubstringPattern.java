package kim.dencka.java.easy;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc")); // true
        System.out.println(repeatedSubstringPattern("aba"));          //false
    }

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0 && s.substring(0, i).repeat(len / i).equals(s)) {
                return true;
            }
        }

        return false;
    }
}
