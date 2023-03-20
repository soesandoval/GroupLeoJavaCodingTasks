package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Descending {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> descendingOrder( ArrayList<Integer> desc){
        int [] arr = {1,8,10,15,3,2}; // output = 15,10,8,3,2,1
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                int temp=0;
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

    return desc; }

}
