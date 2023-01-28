package week6;

import java.util.Arrays;

public class Array_FindMaximum {

    public static int maximumNumber(int[] arr1){



        int maxNumber = -2147483648;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>maxNumber){
                maxNumber = arr1[i];
            }
        }
        System.out.println(maxNumber);
        return maxNumber;



    }

    public static void main(String[] args) {
      int[] arr1 = {2,3,4,5,7,8,9,0,23};
        maximumNumber(arr1);
    }

}
