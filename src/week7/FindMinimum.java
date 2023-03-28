package week7;

public class FindMinimum {

    public static void main(String[] args) {

        int[] array1= {1,2,3,4,5,6};

        getMinValue(array1);


    }

    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Minimum value= " + minValue);
        return minValue;
    }


}
