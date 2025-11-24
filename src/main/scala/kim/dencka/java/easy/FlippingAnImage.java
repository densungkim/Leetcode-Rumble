package kim.dencka.java.easy;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image))); // [[1, 0, 0], [0, 1, 0], [1, 1, 1]]
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) reverse(arr);
        return image;
    }

    public static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int temp = arr[l];
            arr[l++] = arr[r] ^ 1;
            arr[r--] = temp ^ 1;
        }
    }
}
