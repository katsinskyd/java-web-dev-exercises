package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String userWord = input.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        char[] charactersInString = userWord.toCharArray();
//
////        String quote = "If the product of two terms is zero then common sense says at least " +
////                "one of the two terms has to be zero to start with. So if you move all " +
////                "the terms over to one side, you can put the quadratics into a form " +
////                "that can be factored allowing that side of the equation to equal zero. " +
////                "Once you’ve done that, it’s pretty straightforward from there.";
////        char[] charactersInString = quote.toCharArray();
//
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (Character i : charactersInString) {
            if (!letterCounts.containsKey(i)) {
                letterCounts.put(i, 1);
            } else {
                letterCounts.put(i, letterCounts.get(i) + 1);
            }
        }
        for (Map.Entry<Character, Integer> character : letterCounts.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}