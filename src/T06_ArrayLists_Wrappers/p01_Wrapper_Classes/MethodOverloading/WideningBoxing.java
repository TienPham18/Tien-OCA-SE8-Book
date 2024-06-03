package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.MethodOverloading;

public class WideningBoxing {

    static void m(Integer i) {
        System.out.println("Integer");
    }

    static void m(long i) {
        System.out.println("long");
    }


    public static void main(String[] args) {
        short s = 30;
        m(s); // Widening beats unboxing

        int s1 = 15;
        m(s1);

        // double bigger than "long" so compile-error
        //double s1 = 31.0;
        //m(s1);
    }
}
