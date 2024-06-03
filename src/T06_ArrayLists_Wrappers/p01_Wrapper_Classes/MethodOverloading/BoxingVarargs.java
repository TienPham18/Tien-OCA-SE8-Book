package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.MethodOverloading;

public class BoxingVarargs {
    static void m(Integer i) {
        System.out.println("Integer");
    }
    static void m(Integer... i) {
        System.out.println("Integer...");
    }
    public static void main(String[] args) {
        int a = 30;
        m(a);
    }
}
