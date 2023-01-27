package week3;

public class Armstrong_Number {
    /*
    Write a method that can check if a number is Armstrong number
     */
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153)); // should return true
        System.out.println(isArmstrongNumber(370)); // should return true
        System.out.println(isArmstrongNumber(407)); // should return true
        System.out.println(isArmstrongNumber(1634)); // should return true
        System.out.println(isArmstrongNumber(12)); // should return false
    }

    public static boolean isArmstrongNumber(int num) {
        /*int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return (c == b) ? true : false;
    }*/
        int numCopy = num;
        int armstrongSum = 0;
        int numLength = String.valueOf(num).length();

        while (numCopy > 0) {
            int digit = numCopy % 10;
            int temp = 1;
            for (int i = 0; i < numLength; i++) {
                temp *= digit;
            }
            armstrongSum += temp;
            numCopy /= 10;
        }

        if (armstrongSum == num) {
            return true;
        } else {
            return false;
        }


    }
}
