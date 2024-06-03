package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.MethodOverloading;

public class WideningVarargs {
    static void m(int... x) {
        System.out.println("int");
    }

    static void m(long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        short s1=30, s2=40;
        m(); // int
        m(s1,s2); // int
        m(s1); // long
    }
}
