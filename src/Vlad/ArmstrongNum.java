package Vlad;

public class ArmstrongNum {

    public static void armstrongNum(int n){

        int r = 0;
        int sum = 0;
        int s = n;
        int temp = n;

        while (n>0){

            r = n % 10;
            n = n / 10;

            sum = sum + r*r*r;

        }

        if(temp == sum){
            System.out.println(s+" is an Armstrong number");
        }else {
            System.out.println(s+" is not an Armstrong number");
        }




    }

}
