package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch.Break;

public class Snippet {
    public static void main(String [] args) {
        String s = "green";
        switch(s) {
            case "red": System.out.println("red ");
            case "green": System.out.println("green ");
            case "blue": System.out.println("blue ");
            default: System.out.println("done");
        }

        byte x = 1; // long, float, double are not supported in "switch statement"
        switch(x) {
            case 1: System.out.println("x is one");
            case 2: System.out.println("x is two");
            case 3: System.out.println("x is three");
            //case 129: System.out.println("x is three"); // wont compile Required type: byte. Provided: int
        }
        System.out.println("out of the switch");

    }
}
