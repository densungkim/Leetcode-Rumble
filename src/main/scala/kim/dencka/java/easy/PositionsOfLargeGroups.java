package kim.dencka.java.easy;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy")); // [[3,6]]
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> intervals = new ArrayList<>();
        int l = 0, n = s.length();
        for (int r = 1; r <= n; r++) {
            if (r == n || s.charAt(l) != s.charAt(r)) {
                if (r - l >= 3) intervals.add(List.of(l, r - 1));
                l = r;
            }
        }

        return intervals;
    }
}
