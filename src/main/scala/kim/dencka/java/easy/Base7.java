package kim.dencka.java.easy;

public class Base7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100)); // 202
    }

    // built-in method
//    public static String convertToBase7(int num) {
//        return Integer.toString(num, 7);
//    }

    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int target = Math.abs(num);
        while (target > 0) {
            sb.append(target % 7);
            target /= 7;
        }

        if (num < 0) sb.append('-');
        return sb.isEmpty() ? "0" : sb.reverse().toString();
    }
}
