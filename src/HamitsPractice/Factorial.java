package HamitsPractice;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    public static int factorial(int a){

        int factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }

        return factorial;


    }

}
