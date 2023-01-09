package Vlad;

public class Prime_Number {


    public static void isPrime(int n) {


        if (n <= 1) {
            throw new RuntimeException("not prime number: try again");
        }


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n+" is not prime number");
                System.exit(1);
            }
        }

        System.out.println(n+" is prime number");
    }


}
