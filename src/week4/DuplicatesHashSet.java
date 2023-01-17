package week4;

import java.util.LinkedHashSet;

public class DuplicatesHashSet {

    public static void main(String[] args) {

        String str = "Aabbaadbdfbvbaa ";


        LinkedHashSet<Character> map = new LinkedHashSet<>();
        for (String each : str.split("")) {
            if (!each.contains(each + 1)) {
                for (int i = 0; i < each.length(); i++) {
                    map.add(each.charAt(i));
                }
            }

        }
        String str2= map.toString().replace(", ", "").replace("[", "").replace("]","");
        System.out.println(str2);

    }

}
