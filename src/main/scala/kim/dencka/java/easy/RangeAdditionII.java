package kim.dencka.java.easy;

public class RangeAdditionII {
    public static void main(String[] args) {
        int[][] nums = {{2, 2}, {3, 3}};
        System.out.println(maxCount(3, 3, nums)); // 4
    }

    public static int maxCount(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        return minRow * minCol;
    }
}
