package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.Unboxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingCollection {
    public static void main(String[] args) {

        // Creating an empty Arraylist of "Double Type"
        ArrayList<Double> arrayList = new ArrayList<Double>();

        // Autoboxing using add() method
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(24.0);

        System.out.println("ArrayList: " + arrayList);

        // Creating an empty ArrayList of "Long type"
        List<Long> longList = new ArrayList<Long>();

        for(int i=0; i<5; i++)
            System.out.println(longList.add(Long.valueOf(i)));


        int a = 50;
        Integer a2 = a; // Boxing
        Integer a3 = 5; // Boxing

        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);

        Integer i = 100;
        if(i<200) // unnboxing internally
            System.out.println(i);
    }
}
