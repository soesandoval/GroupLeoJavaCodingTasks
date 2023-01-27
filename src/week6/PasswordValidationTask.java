package week6;

import java.rmi.ServerError;

public class PasswordValidationTask {

    public static boolean passValidation(String password){

        boolean isValid = false;
        if(password.contains(" ") || password.length()<6){
            System.err.println("Needs to be at least 6 chars and not contain SPACE!");
            System.exit(1);
        }

        int freqUpper = 0;
        int freqLower = 0;
        int freqDigit = 0;
        int freqSpecChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                freqUpper++;
            } else if (Character.isLowerCase(ch)) {
                freqLower++;
            } else if(Character.isDigit(ch)){
                freqDigit++;
            }else if(!(Character.isLetterOrDigit(ch))){
                freqSpecChar ++;
            }

        }

        if(freqLower<1){
            System.err.println("Password should contain at least one lower case!");
            System.exit(1);
        }else if(freqUpper<1){
            System.err.println("Password should contain at least one Upper case!");
            System.exit(1);
        } else if (freqDigit<1) {
            System.err.println("Password should contain at least one digit!");
            System.exit(1);
        } else if (freqSpecChar<1) {
            System.err.println("Password should contain at least one special character!");
        } else {
            isValid = true;

        }

        System.out.println("Password is Valid");
        return isValid;
    }

    public static void main(String[] args) {

        passValidation("asdfgh123");


    }



}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space 2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */