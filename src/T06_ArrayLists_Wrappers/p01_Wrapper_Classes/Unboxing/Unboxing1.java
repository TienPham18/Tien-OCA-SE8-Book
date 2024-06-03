package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.Unboxing;

public class Unboxing1 {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(10);
        int j = obj; // Unboxing
        System.out.println(j);
        System.out.println(obj);

        Integer i = -8;

        int absVal= absoluteValue(i);
        System.out.println("absolute Value of " + i + " = " + absVal);

    }

    public static int absoluteValue(int i) {
        return (i<0) ? -i : i;
    }
}
