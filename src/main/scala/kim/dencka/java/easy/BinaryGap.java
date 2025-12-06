package kim.dencka.java.easy;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(13)); // 2
    }

    public static int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int start = -1, max = 0;
        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(i) - '0';
            if (bit == 1) {
                if (start == -1) {
                    start = i;
                } else {
                    max = Math.max(max, i - start);
                    start = i;
                }

            }
        }

        return max;
    }
}
