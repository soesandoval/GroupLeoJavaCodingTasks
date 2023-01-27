package week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int num = -123;
        int reversedNum = reverseValue(num);
        System.out.println(reversedNum);
    }
    public static int reverseValue(int num) {
        String numString = Integer.toString(num);
        StringBuilder reversedNumStringBuilder = new StringBuilder();
        boolean isNegative = numString.charAt(0) == '-';
        if(isNegative) {
            reversedNumStringBuilder.append('-');
        }
        for (int i = numString.length()-1; i >= 0; i--) {
            if(numString.charAt(i) != '-')
                reversedNumStringBuilder.append(numString.charAt(i));
        }
        return Integer.parseInt(reversedNumStringBuilder.toString());
    }
}
