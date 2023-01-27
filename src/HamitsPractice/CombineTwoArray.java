package HamitsPractice;

public class CombineTwoArray {

    public static void main(String[] args) {

        int[] array1= {1,2,3,4};
        int[] array2 ={5,6,7,8};

        System.out.println(combinedArrays(array1,array2));

    }

    public static int[] combinedArrays (int[] array1, int[] array2){
        int [] combine = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length ; i++) {
            combine[i] = array1[i];
        }

        for (int i = 0; i < array2.length ; i++) {

            combine[array1.length + i] = array2[i];

        }


        return combine;

    }


}
