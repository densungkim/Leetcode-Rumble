package kim.dencka.java.easy;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab")); // true
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
