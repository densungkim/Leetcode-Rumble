package kim.dencka.java.easy;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        System.out.println(countSegments("  foo   bar")); // 2
        System.out.println(countSegments2("  foo   bar")); // 2
    }

    public static int countSegments(String s) {
        if (s.isBlank()) return 0;
        return s.trim().split("\\s+").length;
    }

    public static int countSegments2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }
}
