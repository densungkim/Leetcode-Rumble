package kim.dencka.java.easy;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("123", "321")); // 444
    }

    public static String addStrings(String num1, String num2) {
        char[] chars1 = num1.toCharArray(), chars2 = num2.toCharArray();
        int i = chars1.length - 1, j = chars2.length - 1;

        StringBuilder result = new StringBuilder();
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? chars1[i] - '0' : 0;
            int digit2 = j >= 0 ? chars2[j] - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            result.append(sum % 10);
            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
