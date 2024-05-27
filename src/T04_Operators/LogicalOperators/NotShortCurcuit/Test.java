package T04_Operators.LogicalOperators.NotShortCurcuit;

public class Test {
    public static void main(String[] args) {
        int z = 5;
        if (++z > 5 || ++z > 6)
            System.out.println(z++);

        if (++z > 5 | ++z > 6)
            System.out.println(z++);

    }
}
