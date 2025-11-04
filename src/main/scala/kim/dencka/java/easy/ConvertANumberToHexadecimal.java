package kim.dencka.java.easy;

public class ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        System.out.println(toHex(26)); // 1a
    }

    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String toHex(int num) {
        char[] result = new char[8];
        int i = 8;

        do {
            int nibble = num & 0xF;
            result[--i] = DIGITS[nibble];
            num >>>= 4;
        } while (num != 0 && i > 0);

        return new String(result, i, 8 - i);
    }
}
