package week5;

public class ReverseCharacters {
    public static void main(String[] args) {

        reverseChar("Sofia");

    }

    public static void reverseChar (String a){

        char ch[] = a.toCharArray();

        String reversed = " ";
        for (int i = ch.length -1; i >= 0; i--) {
            reversed+= ch[i];

        }


        System.out.println("Reversed string" + reversed);

    }

}
