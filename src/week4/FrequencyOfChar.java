package week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    static void characterCount(String inputString)
    {
        // Creating a HashMap containing char
        HashMap<Character, Integer> charCountMap= new HashMap<Character, Integer>();// Creating a HashMap containing char

        char[] strArray = inputString.toCharArray();// Converting given string to char array

        // checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);// If char is present in charCountMap,incrementing it's count by 1
            }
            else {


                charCountMap.put(c, 1);// If char is not present in charCountMap,putting this char to charCountMap with 1 as it's value
            }
        }

        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "Ajit";
        characterCount(str);
    }


}
