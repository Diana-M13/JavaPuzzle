package JavaPuzzle;

import java.util.Scanner;

public class TrickyPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the start");
        int start = scanner.nextInt();
        System.out.print("Please enter the end");
        int end = scanner.nextInt();

         System.out.println(primePalindromeFinder(start,end));


    }


//    TASK 1 — Prime Palindrome Finder
//    Create a method that:
//    Accepts two numbers start and end
//    Returns the first prime number that is also a palindrome in that range
//    You must:
//    Use a nested method to check if a number is prime
//    Use another overloaded method to check if it’s a palindrome (one for int, one for String)
//    Use a for loop
//    Show local variable scopes and avoid unnecessary global variables
//🧠 Example: isPrime(131) → true, isPalindrome(131) → true → return 131

    public static int primePalindromeFinder(int start, int end) {

        for (int i = start; i <end ; i++) {
            if(isPrime(i) && isPalindrome(i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;


    }

    public static boolean isPalindrome(int digits) {
        return isPalindrome(digits + "");
    }


    public static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }


}
