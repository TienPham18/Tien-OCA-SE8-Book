package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch.Default;

public class TestDefault {
    public static void main(String[] args) {
        int x = 5;
        switch (x) {
            // fall-through
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: { System.out.println("x is even"); break; }
            // default is used if none of the cases (the even number) matched.
            default: System.out.println("x is an odd number");

        }

        int y = 6;
        switch (y) {
            // fall-through
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: { System.out.println("y is even"); break;}
            // without break, "y is an odd number" from default is also printed
            default: System.out.println("y is an odd number");
        }

        // default works just like any other "case" for fall-through!!
        int z = 5;
        switch (z) {
            case 2: System.out.println("2");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }

    }
}
