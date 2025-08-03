package JavaPuzzle;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a non-negative number below 13:");
        // First input: factorial using loop

        int num = scanner.nextInt();

        if(num<0 || num>12){
            System.out.println("Please input a valid number");
        }else {
            int factorial = 1;

            for (int i =1; i <=num; i++) {
                factorial *= i;
            }
            System.out.println("Using loop- factorial is : "+factorial);
        }


        // Factorial with recursion;
        System.out.println("Please enter another non-negative number below 13:");
        int num2= scanner.nextInt();




        if (num2 <0 ||  num2>12) {
            System.out.println("Please input a valid number between 0 and 12.");
        }else{
            int res = factorial(num2);
            System.out.println("Using recursion - factorial is : "+res);
        }

        scanner.close();
    }

    public static int factorial(int f) {
        if (f == 1 || f==0) return 1;
        return f * factorial(f - 1);
    }


}