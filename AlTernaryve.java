package JavaPuzzle;

import java.util.Scanner;

public class AlTernaryve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input you score 🥇 ");
        int score = scanner.nextInt();
        System.out.print("Input your attendance 💯 ");
        System.out.print("Please enter your Code Message 🔐");
        String code=scanner.nextLine().toUpperCase().trim();
        int attendance = scanner.nextInt();
        System.out.println(nestedTernary(score));
        System.out.println(scoreCheck(score));
        System.out.println(complicatedScoreChecker(score, attendance));
        System.out.println(secretCodeDetector(code));

        scanner.close();
    }



    //✅ Task 1:
    //Write a program that:
    //Accepts an int variable called score
    //Prints:
    //"Excellent" if score ≥ 90
    //"Good" if 75 ≤ score < 90
    //"Average" if 60 ≤ score < 75
    //"Fail" otherwise
    //⚠️ Use only ternary operators (no if-else!)


    public static String nestedTernary(int score) {
        return (score >= 90) ? "Excellent" :
                (score >= 75) ? "Good" :
                        (score >= 60) ? "Average" : "Fail";
    }


//    Task 2 (Next Level):
//Write a program that:
//Accepts an integer called score from user input.
//If the score is not between 0 and 100 (inclusive), print:
//"Invalid score"
//Otherwise, print:
//"Excellent" if score ≥ 90
//"Good" if 75 ≤ score < 90
//"Average" if 60 ≤ score < 75
//"Fail" otherwise
//⚠️ Use only ternary operators (no if-else!)

    public static String scoreCheck(int score) {
        return (score < 0 || score > 100) ? "Invalid score" :
                (score >= 90) ? "Excellent" :
                        (score >= 75) ? "Good" :
                                (score >= 60) ? "Average" : "Fail";
    }


//    Task 3
//Write a Java program that:
//Takes two inputs from the user:
//score (int)
//attendance (int percentage 0–100)
//Validates both inputs:
//score must be between 0 and 100 inclusive
//attendance must be between 0 and 100 inclusive
//If either is invalid, print "Invalid input(s)"
//If inputs are valid, determine the grade category based on score using an enhanced switch on the tens digit of score (score / 10):
//10, 9 → "Excellent"
//8 → "Very Good"
//7 → "Good"
//6 → "Average"
//0–5 → "Fail"
//Use ternary operators to:
//Check if attendance < 75 → print "Fail due to attendance" regardless of score
//Otherwise, print the grade category from the switch
//Bonus: If attendance is 95 or higher and the grade category is "Excellent," append " with honors" to the output.


    public static String complicatedScoreChecker(int score, int attendance) {
        String scoreCheck = (score >= 0 && score <= 100 && attendance >= 0 && attendance <= 100) ?
                (attendance >= 75) ?
                        switch (score / 10) {
                            case 9, 10 -> "Excellent";
                            case 8 -> "Very Good";
                            case 7 -> "Good";
                            case 6 -> "Average";
                            default -> "Fail";
                        } :

                        "Fail due to attendance" :
                "Invalid input(s)";


        return scoreCheck;
    }


//🧩 Task 3
//A secret agent receives a code in the form of a sentence.
//But the sentence has a hidden rule:
//If the number of vowels is even, the message is real.
//If the number of vowels is odd, the message is a trap.
//If the input is empty or null, it's corrupted.
//🚨 Your mission:
//Write a method that:
//Accepts a String message
//Returns one of the following:
//"Real message ✅" – if the number of vowels (a, e, i, o, u) is even
//"Trap message ⚠️" – if the number is odd
//"Corrupted input 🚫" – if the message is empty or null
//🧠 Rules:
//No if statements
//Use ternary operators, logical operators, and string methods only
//Ignore case (A = a)
//Spaces and punctuation don’t count — only vowels


    public static String secretCodeDetector(String code) {
        int vowelCount = 0;
        for (int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
            }
        }
        String secretCode = (vowelCount % 2 == 1) ? "Trap message ⚠️" :
                (vowelCount !=0 && vowelCount % 2 == 0) ? "Real message" : "Corrupted input 🚫";

        return secretCode;
    }

}
