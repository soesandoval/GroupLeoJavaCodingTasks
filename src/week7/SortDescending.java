package week7;

public class SortDescending {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,7, 8, 90};

        int temporaryValue;

        for (int i = 0; i<array.length; i++){
            for (int j = i; j< array.length; j++){
                if (array[i] < array[j]){
                    temporaryValue = array[i];
                    array[i]=array[j];
                    array[j]=temporaryValue;
                }

            }
        }
        for (int a:array ){
            System.out.println(a);
        }


    }

}
/*

Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */