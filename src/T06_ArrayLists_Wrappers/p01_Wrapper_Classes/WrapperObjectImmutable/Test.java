package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.WrapperObjectImmutable;

public class Test {

    public static void main(String[] args) {
        Integer y = 567;
        Integer x = y;
        System.out.println(y==x); // x and y are the same object

        y++; // create new object y
        System.out.println(x+" "+y);
        System.out.println(y==x); // x and y are different object
    }
}
