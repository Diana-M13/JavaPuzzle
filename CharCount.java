package JavaPuzzle;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {

        charCount("Diana");
    }

//Write a method called charCount that takes a string as input
// and counts how many times each character appears in that string.
// The method should print a map (or dictionary) where keys are characters,
// and values are the counts of those characters.


    public static void charCount(String text) {

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }


        }
        System.out.println(charCount);
    }
}
