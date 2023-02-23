package week9;

import java.util.ArrayList;

public class ArrayList_RemoveValuesMoreThan_100 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(11);
        list1.add(123);
        list1.add(130);
        list1.add(4);
        list1.add(139);
        removeGreaterThan100(list1);

    }

    public static ArrayList<Integer> removeGreaterThan100 (ArrayList<Integer> list1){
        list1.removeIf(n->(n>100));
        System.out.println(list1);
        return list1;
    }
}
