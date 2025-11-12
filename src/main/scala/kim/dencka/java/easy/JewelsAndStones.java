package kim.dencka.java.easy;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
