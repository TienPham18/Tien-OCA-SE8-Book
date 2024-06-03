package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.Boxing;

public class Test {
    public static void main(String[] args) {
        //Integer y = new Integer(567); compile-fehler
        Integer y = 567; // make a wrapper
        y++;
        int x = y.intValue(); // unwrap it
        x++; // use it
        y = new Integer(x); // rewrap it
        System.out.println("y = " + y);



    }

}
