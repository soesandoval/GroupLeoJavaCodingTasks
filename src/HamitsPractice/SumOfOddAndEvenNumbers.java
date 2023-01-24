package HamitsPractice;

public class SumOfOddAndEvenNumbers {


    public static void main(String[] args) {


        int [] array = {12,13,14,15,16,17};

        sum(array);

    }


    public static void sum(int [] a){

        int sumOdd = 0;
        int sumEven =0;

        for (int each: a) {

            if(each % 2 == 0){
                sumEven+= each;
            } else {
                sumOdd += each;
            }

        }

        System.out.println("Sum of Odd= " + sumOdd);
        System.out.println("Sum of even=" + sumEven);

    }


}
