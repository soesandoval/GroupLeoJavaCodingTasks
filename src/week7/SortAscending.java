package week7;

public class SortAscending {
    public static void main(String[] args) {

        int[] array =  new int[] {10,9,8,7};
        // initializing an array
        // this array holds the numbers 10,9,8,7

        int temporaryValue;
        for (int i = 0; i<array.length; i++){ // i and j are swaping
            for (int j = i; j< array.length; j++){
                if (array[i]> array[j]){ // each number is being compared to the next and then looping around to repeat
                   temporaryValue=array[i];
                   array[i]=array[j];
                   array[j] = temporaryValue;
                }
            }
        }
        for (int a:array ){
            System.out.println(a);
        }

    }

}

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without
using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */