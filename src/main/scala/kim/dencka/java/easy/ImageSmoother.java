package kim.dencka.java.easy;

import java.util.Arrays;

public class ImageSmoother {
    public static void main(String[] args) {
        int[][] img = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        System.out.println(Arrays.deepToString(imageSmoother(img))); // [[137, 141, 137], [141, 138, 141], [137, 141, 137]]
    }

    public static int[][] imageSmoother(int[][] img) {
        int n = img.length, m = img[0].length;
        int[][] moves = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] result = new int[n][m];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int sum = img[r][c], parts = 1;
                for (int[] move : moves) {
                    int nr = r + move[0], nc = c + move[1];
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                        sum += img[nr][nc];
                        parts++;
                    }
                }

                result[r][c] = sum / parts;
            }
        }

        return result;
    }
}
