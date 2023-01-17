package week4;

import java.util.LinkedHashSet;
public class RemoveDuplicates {

    public static void removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();//Create LinkedHashSet of type character
        for (int i = 0; i < str.length(); i++)//Add each character of the string into LinkedHashSet
            set.add(str.charAt(i));

        for (Character each : set) // print the string after removing duplicate characters
            System.out.print(each);

    }


    public static void main(String args[])
    {

        String str = "AAAAABBBBBBCCCCCCDDDDD";
        removeDuplicates(str);//removeDuplicates() method by passing the string as an argument
    }
}