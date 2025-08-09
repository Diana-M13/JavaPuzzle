package JavaPuzzle;

import java.util.Random;
import java.util.Scanner;

public class Randomizer2 {
    public static void main(String[] args) {
        fiveRandomNumbers();
        diceSimulator();
        tenRandomBooleans();
        tenRandomDoubles();
        coinTossGame();
        generatePassword();
        guessTheNumber();

    }


    //Task 1
//   Generate random integers
//
//Generate 5 random integers from 0 to 9.
//
//Generate 5 random integers from 1 to 100.
//

//
//Generate random doubles
//
//Print 5 random double values between 0.0 and 1.0.


    public static void fiveRandomNumbers() {
        System.out.println("five random number [0-9] and [1-100]");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Random random1 = new Random();

        for (int i = 0; i < 5; i++) {
            int num0_9 = random1.nextInt(10);
            int num1_100 = random1.nextInt(1, 101);

            sb1.append(num0_9).append(" ");
            sb2.append(num1_100).append(" ");

        }
        System.out.print("For [0,10) : " + sb1 + "\nFor [1,100] : " + sb2);
        System.out.println();
    }

    // Task 2
    //Generate random booleans
    //Print 10 random boolean values.

    public static void tenRandomBooleans() {
        System.out.println("Ten random boolean values");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            boolean toBe = random.nextBoolean();
            if (toBe) {
                System.out.print(" To be ");
            } else {
                System.out.print("Not to be ");
            }
        }
        System.out.println();

    }


    //Task 3
//    Generate random doubles
//    Print 5 random double values between 0.0 and 1.0.

    public static void tenRandomDoubles() {
        System.out.println("Ten  random double numbers ");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double randomDoubleNumber = random.nextDouble(0.0, 1);
            System.out.print(randomDoubleNumber + " ");
        }
        System.out.println();
    }


    //Task 4
//     Dice Simulator – Your Instructions:
//    Create a method called rollDice10Times().
//    Inside it, use the Random class to simulate rolling a 6-sided dice.
//    Remember: Dice values are from 1 to 6.
//    Roll the dice 10 times using a loop.
//    Print all the results on one line, separated by spaces.
//    Example output: Rolls: 3 6 1 5 2 4 6 1 3 2

    public static void diceSimulator() {
        System.out.println("Dice Simulator ");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int diceDigits = random.nextInt(6) + 1;
            System.out.print(diceDigits + " ");

        }
        System.out.println();
    }


    //Task 5
//    Create a method.
//    Toss a coin 20 times using Random.nextBoolean().
//    Count how many times you get:\
//    Heads (true)
//    Tails (false)
//    At the end, print the totals

    public static void coinTossGame() {
        System.out.println("Counts of Heads and Tails");
        Random random = new Random();
        int countOfHeads = 0;
        int countOfTails = 0;
        for (int i = 0; i < 20; i++) {
            boolean isHead = random.nextBoolean();


            if (isHead) {
                countOfHeads++;
            } else {
                countOfTails++;
            }

        }
        System.out.print("Count of Heads : " + countOfHeads + "\nCount of Heads : " + countOfTails);
        System.out.println();
    }


//Task 6
//    Create a method called something like generatePassword().
//    The goal is to create a random 6-character password.
//    The password should use only lowercase English letters: a to z.


    public static void generatePassword() {
        System.out.println("Generating random password");
        Random random = new Random();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int x = random.nextInt(26);
            char letter = (char) ('a' + x);
            password.append(letter);
        }
        System.out.print(password);
        System.out.println();

    }

    //Task 7
//    Create a method called guessTheNumber().
//    Randomly generate a number between 1 and 50.
//    You (the “user”) will try to guess it by hardcoding guesses in code (since you can’t take input).
//    Use a loop:
//    If the guess is too low, print: "Too low"
//    If the guess is too high, print: "Too high"
//    If it's correct, print: "Correct! You guessed it in X attempts" and break.

    public static void guessTheNumber() {
        Random random = new Random();
        int secretNumber = random.nextInt(1,51);
        System.out.print("Can you guess the secret number in 3 chances 🪄 ? ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your guess: ");
            int userInput = scanner.nextInt();
           if (userInput == secretNumber) {
                System.out.println("You win the Magic game.Congratulations 🎉🎉🎉 ");
               return;
            }else if( Math.abs(secretNumber - userInput) < 18) {
               System.out.println("Too hooot 🔥!");
           }else if (Math.abs(secretNumber - userInput) >= 36) {
               System.out.println("Too coold 🥶!");
           }
            else {
                System.out.println(" hot ❤️‍🔥!");
            }

        }System.out.println("Oops.You've tried all your chances");
        System.out.println("the Secret Number was : "+secretNumber);

    }
}



