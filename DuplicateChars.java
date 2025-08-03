package JavaPuzzle;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        duplicateCharacters("Diiaao n o a");
    }

    public static void duplicateCharacters(String word) {
        word = word.replaceAll("\\s+", ""); // Remove all whitespace
        Set<Character> seen = new HashSet<>();
        Set<Character> printed = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (seen.contains(currentChar)) {
                if (!printed.contains(currentChar)) {
                    System.out.println(currentChar + " ");
                    printed.add(currentChar);
                }
            }else {
                seen.add(currentChar);
            }
        }

    }
}


