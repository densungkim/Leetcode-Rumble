package kim.dencka.java.easy;

public class GoatLatin {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin")); // "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
    }

    public static String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";

        StringBuilder adds = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (String word : sentence.split(" ")) {
            adds.append('a');
            if (vowels.indexOf(word.charAt(0)) == -1) {
                word = word.substring(1) + word.charAt(0);
            }

            res.append(word).append("ma").append(adds).append(' ');
        }
        res.deleteCharAt(res.length() - 1);

        return res.toString();
    }
}
