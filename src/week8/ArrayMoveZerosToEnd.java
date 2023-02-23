package week8;

import java.util.Arrays;

public class ArrayMoveZerosToEnd {

    public static void main(String[] args) {
        int [] arr1 = {2, 0, 3, 0, 4, 5, 1, 0, 10, 0, 13, 4};
        moveZerosToEnd(arr1);

    }




    public static void moveZerosToEnd(int[] arr1){
        
        int[] arr2 = {arr1.length};
        int i = 0;
        for (int element : arr1) {
            if(element!=0){
                arr2[i] = element;
                i++;
            }
        }
        while(i < arr1.length){
            arr2[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(arr2));
        
    }

}
