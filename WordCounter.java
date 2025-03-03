
import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String sentence) {
        // Remove leading and trailing whitespace
        sentence = sentence.trim();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Return the number of words
        return words.length;
    }
}

