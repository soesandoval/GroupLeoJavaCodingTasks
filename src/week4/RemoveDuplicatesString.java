package week4;

public class RemoveDuplicatesString {
    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) { //loop to reach each char
            if (!result.contains("" + str.charAt(i))) { // if char is NOT present add it to the empty string
                result += "" + str.charAt(i);
            }

        }

        return result;

    }


    public static void main(String[] args) {
String str= "AAABBBCCC";
removeDup(str);
        System.out.println(removeDup(str));
    }
}