package week10;

import java.util.ArrayList;

public class ArrayList_Ascending {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> ascendingOrder(ArrayList<Integer> asc){
        int[] ascNumbers = new int[]{60,50,40,30,20}; //output : 20,30,40,50,60
        for (int i = 0; i < ascNumbers.length; i++) {
            System.out.println(ascNumbers[i]);
        }
       int tempValue;
        for (int i = 0; i < ascNumbers.length; i++) {
            for (int j = i; j < ascNumbers.length; j++) {
            if(ascNumbers[i]> ascNumbers[j]){
                tempValue=ascNumbers[i];
                ascNumbers[i]=ascNumbers[j];
                ascNumbers[j]=tempValue;
            }
            }
        }
   return asc; }
}

//ArrayList - sorting in ascending
//Write a method that can sort the ArrayList in Ascending order without using the sort method.
