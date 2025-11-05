package kim.dencka.java.easy;

import java.util.Arrays;

public class ConstructTheRectangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(122122))); // [427,286]
    }

    public static int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while (area % width > 0) {
            width--;
        }

        return new int[]{area / width, width};
    }
}
