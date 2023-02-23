package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Eric","John","Ahmed","Jen","Ahmed","Aliss"));
        removeName(names);

    }


    public static ArrayList<String> removeName (ArrayList<String> names){
        names.removeIf(p->p.startsWith("Ahmed"));
        System.out.println(Arrays.asList(names));
        return names;
    }
}
