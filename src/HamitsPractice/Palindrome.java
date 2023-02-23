package HamitsPractice;

public class Palindrome {

    public static void main(String[] args) {
        String input = "SAR";

        palindrome(input);


    }



      public static boolean palindrome (String input){

          boolean isPalindrome = false;
          String reversed = "";


          for (int i = input.length()-1 ; i >= 0 ; i--) {
              reversed = reversed + input.charAt(i);
          }

          if (input.equals(reversed)){
              System.out.println("Palindrome");
             isPalindrome = true;}else {
              System.err.println("Not a palindrome");
          }

          return isPalindrome;

      }

}
