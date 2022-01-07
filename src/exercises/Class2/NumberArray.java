package exercises.Class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(evenSum(numbers));

        Scanner input = new Scanner(System.in);
        String phrase = "This is a sentence.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println("Enter word length:");
        int numChars = input.nextInt();

        printFiveLetterWords(wordList, numChars);
    }
    public static int evenSum(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> array, int length) {
        for (String word: array) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
