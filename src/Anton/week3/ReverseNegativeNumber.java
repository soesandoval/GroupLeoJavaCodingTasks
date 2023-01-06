package Anton.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        reverseNegative(-12346);
    }

    public static int reverseNegative(int num){

        int reverse = 0;
        if(num>=0)
            throw new RuntimeException("Please provide negative number");


        while(num!=0){

            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println(reverse);
        return reverse;
    }
}
