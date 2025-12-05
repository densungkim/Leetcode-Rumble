package kim.dencka.java.easy;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(transpose(matrix))); // [[1, 4], [2, 5], [3, 6]]
    }

    public static int[][] transpose(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        int[][] result = new int[C][R];

        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                result[c][r] = matrix[r][c];
            }
        }

        return result;
    }
}
