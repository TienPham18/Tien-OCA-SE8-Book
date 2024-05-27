package T04_Operators.LogicalOperators.ShortCurcuit;

public class TestAND {
    public static void main(String[] args) {
        if ((isItSmall(6)) && (isItSmall(7))) {
            System.out.println("Result of first if-statement is true");
        }
        if ((isItSmall(2)) && (isItSmall(3))) {
            System.out.println("Result of second if-statement is true");
        }
    }

    public static boolean isItSmall(int i) {
        if (i < 5) {
            System.out.println("i < 5");
            System.out.println("return true");
            return true;
        } else {
            System.out.println("i >= 5");
            System.out.println("return false");
            return false;
        }
    }
}
