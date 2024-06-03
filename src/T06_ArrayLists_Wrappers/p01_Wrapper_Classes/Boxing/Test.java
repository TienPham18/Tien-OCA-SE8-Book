package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.Boxing;

public class Test {
    public static void main(String[] args) {
        //Integer y = new Integer(567); compile-fehler
        Integer y = 567; // make a wrapper
        y++;
        System.out.println("y = " + y);


    }

}
