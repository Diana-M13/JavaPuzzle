package JavaPuzzle;

public class ReversedString {
    public static void main(String[] args) {
        System.out.println(reversedString("Diana"));
        System.out.println("The reversed version of anaiD is with recursion is " + reversedStringRecursion("anaiD"));
    }

// reversing  text with a loop
    public static String reversedString(String text) {
        if (text == null || text.isEmpty()) return "Input is empty.";

        StringBuilder rev = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            rev.append(text.charAt(i));
        }
        return "The reversed version of " + text + " is :" + rev;

    }

// reversing  text with a recursion

    public static String reversedStringRecursion(String text) {
        if (text == null || text.length() <= 1) return text;

        return text.charAt(text.length() - 1) + reversedStringRecursion(text.substring(0, text.length() - 1));

    }
}
