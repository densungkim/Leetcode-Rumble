package kim.dencka.java.easy;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4)); // "5F3Z-2E9W"
    }

    public static String licenseKeyFormatting(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int step = k, i = chars.length - 1;

        while (i >= 0) {
            if (step == 0 && chars[i] != '-') {
                step = k;
                sb.append('-');
            }
            if (chars[i] != '-') {
                sb.append(Character.toUpperCase(chars[i]));
                step--;
            }
            i--;
        }

        return sb.reverse().toString();
    }
}
