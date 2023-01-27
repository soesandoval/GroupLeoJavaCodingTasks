package week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfIntegers {
    public static void main(String[] args) {


        int[] arr = { 3, 3, 4, 5, 7, 6, 6};
        HashMap<Integer, Integer> map = new HashMap<>();// create Hashmap of Integers
        for (int i = 0; i < arr.length; i++) {// Loop to access all array elemnts
            if( map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);// Each key is the element, value is the frequency, if e
            }
            else {
                map.put(arr[i],1);// if Key( element ) is present once, add number 1
            }
        }
        for (Map.Entry entry:map.entrySet()) { // reach to each element

            System.out.println("Element " +entry.getKey() +" "+"Frequency "+ entry.getValue());

        }
    }
//Write a return method that can find the frequency of characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


}