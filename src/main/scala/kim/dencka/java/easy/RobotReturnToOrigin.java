package kim.dencka.java.easy;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("RDLU")); // true
    }

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'R') y++;
            if (ch == 'L') y--;
            if (ch == 'U') x--;
            if (ch == 'D') x++;
        }

        return x == 0 && y == 0;
    }
}
