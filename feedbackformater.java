import java.util.Scanner;

public class feedbackformater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String keyword = sc.nextLine();

        String trimmed = sentence.trim();
        String[] words = trimmed.isEmpty() ? new String[0] : trimmed.split("\\s+");

        StringBuilder formatted = new StringBuilder();
        String longest = "";
        int longestLength = 0;
        int wordCount = words.length;
        int keywordCount = 0;
        StringBuilder acronym = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String titleCase = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            if (i > 0) {
                formatted.append(" ");
            }
            formatted.append(titleCase);

            if (titleCase.length() > longestLength) {
                longestLength = titleCase.length();
                longest = titleCase;
            }

            if (word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }

            acronym.append(titleCase.charAt(0));
        }

        System.out.println("Formatted: " + formatted);
        System.out.println("Words: " + wordCount);
        System.out.println("Longest word: " + longest);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Acronym: " + acronym);

        sc.close();
    }
}
