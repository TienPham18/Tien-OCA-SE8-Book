package T06_ArrayLists_Wrappers.p01_Wrapper_Classes.Unboxing;

public class Unboxing2 {
    public static void main(String[] args) {
        //Integer i = new Integer(10);
        Integer box = 10; // boxing an "Integer Object"
        int unbox = box; // unboxing the Object

        System.out.println("Value of box: " + box);
        System.out.println("Value of unbox: " + unbox);

        System.out.println("============================");
        Character boxchar = 'a'; // boxing an "Character object"
        char unboxchar = boxchar;

        System.out.println("Value of boxchar: " + boxchar);
        System.out.println("Value of unboxchar: " + unboxchar);



    }
}
