package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabbcccdd";

        HashMap<String,Integer> map= new HashMap<>();

        for (String each : str.split("")) { // split every character with empty space " ", and reach to eaach character
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
           map.put(each,frequency);
        }
        System.out.println(map);
    }
}
