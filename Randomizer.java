package JavaPuzzle;

import java.security.SecureRandom;
import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.println(secureRandomWithBytes(13));
        System.out.println("Task 2");
        System.out.println(secureNumberGenerator(13));
        System.out.println("Task 3");
        System.out.println(randomCheck());
        System.out.println("Task 4");
        seedVSNoSeed();
        System.out.println("Task 5");
        randomMethod1();

    }









    //Task 1
//    Write a method called randomMethod1 that
// generates a random string consisting of digits (0-9) with a fixed length (e.g., 13 characters).
// The method should print this random numeric string.


    public static void randomMethod1() {
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int length = 13;
        for (int i = 0; i < length; i++) {
            int x = sr.nextInt(10);
            sb.append(x);
        }
        System.out.println(sb);

    }

    //Task2
//Write a method called seedVSNoSeed that creates three Random objects:
//Two with the same fixed seed (e.g., 123), called seedRandom1 and seedRandom2.
//One without a seed (default constructor), called random3.
//For each Random object, generate and print 5 random integers between 0 and 99.

    public static void seedVSNoSeed() {
        Random seedRandom1 = new Random(123);
        Random seedRandom2 = new Random(123);
        Random random3 = new Random();

        System.out.println("Sequence from seedRandom1");
        for (int i = 0; i < 5; i++) {
            System.out.println(seedRandom1.nextInt(100));

        }
        System.out.println("Sequence from seedRandom2");
        for (int i = 0; i < 5; i++) {
            System.out.println(seedRandom2.nextInt(100));

        }
        System.out.println("Sequence from random3");
        for (int i = 0; i < 5; i++) {
            System.out.println(random3.nextInt(100));

        }
    }

    //task 3
//    Write a method called randomCheck that generates
//    and returns a random string of 13 uppercase letters (A to Z).

    public static String randomCheck() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            int x = random.nextInt(65, 91);
            sb.append((char) x);

        }
        return sb.toString();
    }


    //Task 4
//    Task: Implement two methods to generate secure random numeric strings
//Method 1: secureRandomWithBytes(int length)
//Uses SecureRandom to generate a byte array of specified length.
//Converts each byte into a digit (0-9) by masking with 0xFF and then taking modulo 10.
//Returns a string made of these digits.
//Method 2: secureNumberGenerator(int length)
//Uses SecureRandom to generate random digits (0-9) one by one.
//Appends each digit to a string builder and returns the resulting string.


    public static String secureRandomWithBytes(int length) {
        SecureRandom sr = new SecureRandom();
        byte[] bytes = new byte[length];
        sr.nextBytes(bytes);


        StringBuilder sb1 = new StringBuilder();

        for (byte b : bytes) {
            int digit = (b & 0xFF) % 10;   //  b-ն մեր զանգվածի էլեմենտ է,0xFF-ը 2-ական համակարգով 1111111 է,255;(b & 0xFF) վերացնում է - նշանը,սա վերադարձնում է վերջին թվանշանը
            sb1.append(digit);
        }
        return sb1.toString();
    }

    public static String secureNumberGenerator(int length) {
        SecureRandom sr = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb2.append(sr.nextInt(10));

        }
        return sb2.toString();
    }
}
