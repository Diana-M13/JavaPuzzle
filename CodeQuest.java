package JavaPuzzle;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CodeQuest {
    public static void main(String[] args) {
//        Random random = new Random();
//        formattersChallenge("Diana", 25, "February 13th", "Java Software Engineer", "INTJ", 59.55);
//        coolMath(random);
//        ageGatekeeper();


    }


    //Task 1
    // Write a program to print your personal info using printf() with this format:
    public static void formattersChallenge(String name, int age, String birthday, String profession, String mbti_type, double weight) {
        System.out.printf("Hi. I'm %s%nI'm %d years old.%nI weigh %.1f kg%nI'm a %s%n" +
                "My B-day is at %s%nLong story-short,my MBTI type is %s %n", name, age, weight, profession, birthday, mbti_type);
    }


    //Task 2
//    Write a program that:
//    Generates a random number between 1 and 50.
//    Prints the number.
//    Prints its square (number × number).
//    Prints its square root (use Math.sqrt()).
//    Prints its rounded value (use Math.round()).
//    Checks if the number is even or odd and prints that.

    public static void coolMath(Random random) {
        int x = random.nextInt(1, 51);
        double y = x + random.nextDouble(0.0, 1.0);
        boolean isOdd = x % 2 == 1;
        System.out.printf("x = %d%n" +
                        "y = %.3f%n" +
                        "x² = %d%n" +
                        "√x = %.1f%n" +
                        "y ≈ %d%n" +
                        "Is x Odd: %b%n",
                x, y, (int) Math.pow(x, 2), Math.sqrt(x), Math.round(y), isOdd);

    }

// Task 3
//    Write a method that:
//    Asks the user to input their age.
//    Prints the age category using nested if statements:
//    Age	Category
//    < 13	Child
//    13–19	Teen
//    20–59	Adult
//    60+	Senior

    public static void ageGatekeeper() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you ? ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("Senior");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else if (age > 13) {
            System.out.println("Teenager");

        } else if (age > 0) {
            System.out.println("Child");
        } else {
            System.out.println("Invalid input.Age can't be non-positive");
        }
        scanner.close();
    }


}