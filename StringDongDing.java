package JavaPuzzle;


public class StringDongDing {
    public static void main(String[] args) {


        lastOrFirst("One  Direction");
        System.out.println(maskTheMiddle("Diana Grey"));
        middleThree("Diana");
        removeMiddle("InDiana");
        capitalizeEveryWord("where do broken hearts go");


    }

    //Task 1
//    Given a string:
//    If the string length is odd, print the last character twice.
//    If the string length is even, print the first and last characters combined.

    public static void lastOrFirst(String word) {
        System.out.println(word);
        if (word.length() % 2 == 1) {
            System.out.println("" + word.charAt(word.length() - 1) + word.charAt(word.length() - 1));
        } else {
            System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));
        }
    }


    //Task 2
//    Write a method that:
//    Takes a single word (String) as input.
//    Prints the word but replaces all characters except the first and last with asterisks ('*').
//    If the word length is less than or equal to 2, print the word as is.


    public static String maskTheMiddle(String word) {
        if (word.length() <= 2) {
            return word;
        }

        StringBuilder maskedWord = new StringBuilder();
        maskedWord.append(word.charAt(0));

        for (int i = 1; i < word.length() - 1; i++) {
            if (!Character.isWhitespace(word.charAt(i))) {
                maskedWord.append("*");
            } else {
                maskedWord.append(" ");
            }
        }
        maskedWord.append((word.charAt(word.length() - 1)));
        return maskedWord.toString();
    }


//    Task 3
//    Write a method that takes a string with odd length (≥ 3) and returns the middle three characters.
//    Examples:
//            "JavaScript" → "Scr"
//            "Diana" → "ian"
//            "Hello" → "ell"


    public static void middleThree(String word) {
        int middleIndex = word.length() / 2;
        String middle_three;
        if (word.length() >= 3 && word.length() % 2 == 1) {
            middle_three = word.substring(middleIndex - 1, middleIndex + 2);
            System.out.println(middle_three);

        } else System.out.println("Length is even or less than 3 " + word);

    }

//    Task 4
//    Write a method that:
//    Takes a string with odd length ≥ 3.
//    Removes the middle character and returns the new string.
//            Examples:
//            "Diana" → "Dana" (removed 'i')
//            "Hello" → "Helo" (removed 'l')
//

    public static void removeMiddle(String word) {
        int middleIndex = word.length() / 2;
        String wordWithoutMiddleChar;

        if (word.length() >= 3 && word.length() % 2 == 1) {
            wordWithoutMiddleChar = word.substring(0, middleIndex) + word.substring(middleIndex + 1);
            System.out.println(wordWithoutMiddleChar);
        } else System.out.println("Length is even or less than 3");
    }

//    Task: 5
//    Write a method that:
//    Takes a sentence (String) with multiple words separated by spaces.
//    Returns the sentence with every word’s first letter capitalized, the rest lowercase.
//    Example:
//    Input: "java is fun to learn"
//    Output: "Java Is Fun To Learn"

    public static void capitalizeEveryWord(String text) {
        StringBuilder capitalized = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (i == 0 || Character.isWhitespace(text.charAt(i - 1))) {
                capitalized.append(Character.toUpperCase(currentChar));
            } else {
                capitalized.append(Character.toLowerCase(currentChar));
            }
        }
        System.out.println(capitalized);

    }


}
