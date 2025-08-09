package JavaPuzzle;

public class Arrayasaur {
    public static void main(String[] args) {


//        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//        for (int element : shiftAndReplace(numbers)) {
//            System.out.print(element + " ");
//        }
//        int[][] twoDArray = {{1, 3,6},
//                            {1, 0, -3},
//                            {3, 26, -23}};
//
//        for (int max:maxInRows(twoDArray)){
//            System.out.print(max+" ");
//        }
//
//
//

        dynamicAverageCalculator("test1",1,2,3,4);
        dynamicAverageCalculator("test2");

    }


//    Task 1
//You have an integer array:
//int[] arr = {3, 5, 7, 9, 11, 13};
//Task:
//Shift all elements to the right by one position.
//The last element should move to the first position.
//Print the result.
//Example output:

//13 3 5 7 9 11


    public static int[] shiftAndReplace(int[] numbers) {
        int last = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = last;
        return numbers;
    }

//    Task 2
//You have:
//int[][] matrix = {
//    {5, 12, 17},
//    {3,  9,  4},
//    {8,  1, 15}
//};
//Create a method that finds the maximum number in each column.
//Return these maximums as a 1D array.
//Print the result in one line, separated by spaces.

    public static int[] maxInRows(int[][] twoDArray) {
        int[] max = new int[twoDArray.length];  // one max per row

        for (int i = 0; i < twoDArray.length; i++) {  // loop rows
            int maxNumber = twoDArray[i][0];          // start with first element in row i

            for (int j = 1; j < twoDArray[i].length; j++) {  // loop columns in row i
                if (twoDArray[i][j] > maxNumber) {
                    maxNumber = twoDArray[i][j];             // update max if found bigger
                }
            }

            max[i] = maxNumber;  // store max for row i
        }

        return max;
    }

//
//Varargs tricky task — “Dynamic Average Calculator”
//    Create a method like:
//    static double average(String label, int... numbers)
//    It takes a label (a String) and any number of integers (varargs).
//    It prints the label and the average of the numbers.
//    If no numbers are passed, print "No numbers to average".
//    Example calls:
//
//    average("Test1", 4, 6, 8);  // Output: Test1: 6.0
//    average("Empty");           // Output: No numbers to average

    public static void dynamicAverageCalculator(String label,int ... numbers) {
        if (numbers.length > 0) {
            int sum = 0;

            for (int i : numbers) {
                sum += i;
            }
            double average = (double) sum / numbers.length;
            System.out.println(label + " " +average);
        } else {
            System.out.println("No numbers to average");
        }
    }
}
