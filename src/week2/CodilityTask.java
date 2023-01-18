package week2;


import java.util.Scanner;

public class CodilityTask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Given a number please");
        int num = read.nextInt();
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = "";
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) result = result + "Codility";
                if (i % 3 == 0) result = result + "Test";
                if (i % 5 == 0) result = result + "Coders";
                System.out.println(result);
            } else System.out.println(i);
        }
        read.close();

    }
}
