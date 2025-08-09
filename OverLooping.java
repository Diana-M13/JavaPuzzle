package JavaPuzzle;

public class OverLooping {
    public static void main(String[] args) {

        loopMagic(30);
        loopMagic(1, 30);
        loopMagic();

    }


    //TASK 1
//Create 3 overloaded methods called loopMagic:
//loopMagic(int n) – prints all numbers divisible by 3 up to n, skipping those divisible by 9
//loopMagic(int start, int end) – counts how many even numbers exist in range (using while)
//loopMagic() – prints a triangle using nested loops:
//*
//* *
//* * *
//* * * *
    public static void loopMagic(int n) {
        System.out.println("Numbers divisible by 3 but not by 9:");
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                System.out.println(i);
            }
        }
    }


    public static void loopMagic(int start, int end)
    {
        //counting how many even numbers are in the range
        int originalStart = start;
        int evenCount = 0;
        while (start <= end) {
            if (start % 2 == 0) {
                evenCount++;
            }
            start++;
        }
        System.out.printf("In the range of %d and %d, there are %d even numbers.\n", originalStart, end, evenCount);
        System.out.println();
    }


    public static void loopMagic() {
        //printing stars
        int row = 1;
        while (row<=5) {
            int col = 1;

            while (col<=row) {

                System.out.print("*");
                col++;
            }
            System.out.println();
           row++;
        }
    }

}
