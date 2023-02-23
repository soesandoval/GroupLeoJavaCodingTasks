package week7;


public class FindMaximum {
    public static void main(String[] args) {

        int[] array = {20,50,90,8,10}; // int array of numbers to find the max which is 10

        System.out.println("maximumNumber() = " + maximumNumber(array));
        // printing out the max number using the maximumNumber method to find max number

    }


    public static int maximumNumber(int[] max ){
        // creating a return method called maxiumNumber
        // and argument is int[] max to return the int [] max number

        int tempValue = max[0]; // initializing the temporary value at
        // index 0 to compare with the rest of the numbers

        for (int i = 0; i<max.length; i++){
            // starts at 0
            // goes to the end of the max list of numbers
            // i++ continues going up until finding max number

            if (tempValue<max[i])
                // if the temporary value is less than x at the next index
                tempValue = max[i];
            // then you reassign the temp value to the next array until finding the max value
        }

   return tempValue; }

}
/*
Question1: Array - Find Minimum
 Write a method that can find the maximum number from an int Array
 */