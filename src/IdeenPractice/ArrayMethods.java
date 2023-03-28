package IdeenPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayMethods {



    public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */


        // solution 1
        public static int[] removeDuplicates(int[] array){
            return Arrays.stream(array).distinct().toArray();
        }


        //solution 2
        public static int[] removeDuplicates2(int[] array){
            ArrayList<Integer> list = new ArrayList<>();
            for(int each: array){
                if(!list.contains(each)){
                    list.add(each);
                }
            }

            array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        }
    }
    public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

        public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

            int[] result = new int[arr1.length + arr2.length];

            int i = 0;
            for (int each : arr1) {
                result[i++] = each;
            }

            for (int each : arr2) {
                result[i++] = each;
            }

            return result;
        }
    }
    public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */


        // solution 1
        public static List<Integer> remove1(List<Integer> list){

            Iterator<Integer> it = list.iterator();

            while (it.hasNext()){
                if(it.next()>100){
                    it.remove();
                }
            }

            return list;
        }

        // solution 2
        public List<Integer> remove2(List<Integer> list){
            list.removeIf(number -> number > 100);
            return list;
        }
    }
    public class List_RemoveNameAhmed {

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */


        // solution 1
        public static List<String> remove1(List<String> names) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                if (it.next().equals("Ahmed"))
                    it.remove();
            }
            return names;
        }


        // solution 2
        public static List<String> remove2(List<String> names) {
            names.removeAll(Arrays.asList("Ahmed"));
            return names;
        }


        // solution 3
        public static List<String> remove3(List<String> names) {
            names.removeIf(name -> name.equals("Ahmed"));
            return names;
        }
    }
    public class Array_SumUpTo0 {

    /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

        public static int[] solution(int N) {

            int[] result = new int[N];
            int sum = 0;

            for (int i = 0; i < N - 1; i++) {
                result[i] = i;
                sum += i;
            }

            result[N - 1] = -sum;

            return result;
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(solution(9)));
        }
    }
    public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

        public static int[] moveZerosToTheEnd(int[] array) {

            int[] result = new int[array.length];
            int count = 0;

            for (int each : array) {
                if (each != 0)
                    result[count++] = each;
            }

            return result;

        }
    }

}
