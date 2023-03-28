package week11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumValueUsingMap {

    public static void minimumValueInMap(Map<String, Integer> map) {

        Map.Entry<String, Integer> minNumber = null;

        for (Map.Entry<String, Integer> number : map.entrySet()) {

            if (minNumber == null || number.getValue().compareTo(minNumber.getValue()) < 0) {
                minNumber = number;
            }

        }

        System.out.println("Minimum number " + minNumber);

    }


    public static void main(String[] args) {


        Map<String,Integer> map = new HashMap<>();

        map.put("first", 30);
        map.put("second", 20);
        map.put("third", 10);

        minimumValueInMap(map);

    }

}