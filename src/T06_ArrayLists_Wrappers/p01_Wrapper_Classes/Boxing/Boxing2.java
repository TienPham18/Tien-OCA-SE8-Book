package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.Boxing;

public class Boxing2 {
    static Integer x; // x = null
    public static void main(String[] args) {
        doStuff(x); // throws a NullPointerException, can not invoke doStuff()
    }

    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z);
    }
}
