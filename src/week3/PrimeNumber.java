package week3;

public class PrimeNumber {
    /*
       Write a method that can check if a number is prime or not
    */
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(2));    // true
        System.out.println(isPrimeNumber(3));    // true
        System.out.println(isPrimeNumber(4));    // false
        System.out.println(isPrimeNumber(29));
    }
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }


}

