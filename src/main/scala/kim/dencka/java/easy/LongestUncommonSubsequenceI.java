package kim.dencka.java.easy;

public class LongestUncommonSubsequenceI {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aaa", "aaaa")); // 4
    }

    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
