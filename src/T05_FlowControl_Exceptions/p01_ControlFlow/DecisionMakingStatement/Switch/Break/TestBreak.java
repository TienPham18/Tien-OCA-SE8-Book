package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch.Break;

public class TestBreak {
    public static void main(String[] args) {
        int a = 2;
        switch(a) {
            case 1: System.out.println("a is one");
            case 2: System.out.println("a is two");
            case 3: System.out.println("a is three");
        }
        System.out.println("1. out of the switch 1");

        int b = 3;
        switch(b) {
            case 1: {
                System.out.println("b is one"); break;
            }
            case 2: {
                System.out.println("b is two"); break;
            }
            case 3: {
                System.out.println("b is three"); //break;
            }
            case 4: {
                System.out.println("b is four"); break;
            }
            case 5: {
                System.out.println("b is five"); break;
            }
        }
        System.out.println("2. out of the switch 2");

        int c = 4;
        switch (c) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: {
                System.out.println("c is an even number"); //break;
            }}
        System.out.println("3. out of the switch 3");
    }
}
