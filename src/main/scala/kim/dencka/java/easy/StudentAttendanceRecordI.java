package kim.dencka.java.easy;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP")); // true
    }

    public static boolean checkRecord(String s) {
        int countA = 0, countL = 0;

        for (char ch : s.toCharArray()) {
            if (ch != 'L') countL = 0;
            if (ch == 'L') countL++;
            if (ch == 'A') countA++;
            if (countA == 2 || countL == 3) return false;
        }

        return true;
    }
}
