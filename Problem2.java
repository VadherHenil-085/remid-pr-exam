import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String keyword = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        StringBuilder formatted = new StringBuilder();
        StringBuilder acronym = new StringBuilder();

        String longestWord = "";
        int keywordCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String titleCase = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            if (i > 0) {
                formatted.append(' ');
            }
            formatted.append(titleCase);
            acronym.append(Character.toUpperCase(word.charAt(0)));

            if (titleCase.length() > longestWord.length()) {
                longestWord = titleCase;
            }

            if (word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }
        }

        System.out.println("Formatted: " + formatted);
        System.out.println("Words: " + words.length);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Acronym: " + acronym);

        sc.close();
    }
}
