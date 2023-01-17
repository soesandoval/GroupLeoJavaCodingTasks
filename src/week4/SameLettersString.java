package week4;

import java.util.Arrays;

public class SameLettersString {

    public static void main(String[] args) {
String str1 = "abbbbbc";
        String str2 = "bcdddddddddeeea";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();


        Arrays.sort(charArray1);// sort the char array
        Arrays.sort(charArray2);

        // if sorted char arrays are same, print true
        boolean result = Arrays.equals(charArray1, charArray2);// if sorted char arrays are same, print true


            System.out.println(result);


}



    /*  if (str1.contains(str2)){
           System.out.println( true);
       }else {
           System.out.println(false );
       }
    }
}*/
    }
