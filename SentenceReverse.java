import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String reversedSentence = reverseSentence(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Reverse the order of the words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        // Remove trailing whitespace
        return reversedSentence.toString().trim();
    }
}
