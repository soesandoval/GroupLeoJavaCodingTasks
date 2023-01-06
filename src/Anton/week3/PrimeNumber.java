package Anton.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        isPrimeNumber(6);

    }


    public static void isPrimeNumber(int num) {


        int primeCount = 0;
        if (num <= 1) {
            throw new RuntimeException("Number must be greater than 1");
        }

        for (int i = 2; i <= num; i++) {
            if (num % i == 0)
                primeCount++;
        }
        if (primeCount == 1)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }





}
