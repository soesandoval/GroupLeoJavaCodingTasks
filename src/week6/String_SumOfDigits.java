package week6;

public class String_SumOfDigits {

    public static int SumOfDigits(String str1){

        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(i);  // created temp char variable
            if(Character.isDigit(temp)){
                int b = Integer.parseInt(String.valueOf(temp)); // convert String to String object and then converts String object to integer
                sum = sum+b;
            }
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits("233");
    }

}
