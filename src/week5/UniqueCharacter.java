package week5;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {

        String a = "SofiaSandoval";

        UniqueChar(a);


    }

    public static void UniqueChar (String a){
        int [] count = new int[256]; // count can have up to 256 characters
        for (int i = 0; i < a.length(); i++) { // repeats the length of the string multiple times
            char ch = a.charAt(i); // gets index of each char
            count[ch]++; // every time the char is repeated, it will be added to the count
        }

        for (int i = 0; i < a.length(); i++) {
            char chh = a.charAt(i); // index of a char
            if(count[chh] == 1){ // only char that is repeated once will be printed out
                System.out.println("index = " + i + " is a unique character.");
            }
        }

    }


}