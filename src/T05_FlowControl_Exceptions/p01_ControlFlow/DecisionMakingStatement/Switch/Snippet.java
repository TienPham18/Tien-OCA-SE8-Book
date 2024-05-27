package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch;

public class Snippet {
    public static void main(String [] args) {
        String s = "green";
        switch(s) {
            case "red": System.out.println("red ");
            case "green": System.out.println("green ");
            case "blue": System.out.println("blue ");
            default: System.out.println("done");
        }

        byte varByte = 1; // long, float, double are not supported in "switch statement"
        switch(varByte) {
            case 1: System.out.println("varByte is one");
            case 2: System.out.println("varByte is two");
            case 3: System.out.println("varByte is three");
            //case 129: System.out.println("varByte is three"); // wont compile Required type: byte. Provided: int
        }
        System.out.println("out of the switch");

        char y = 'c';
        switch(y) {
            case 'a': System.out.println("a ");
            case 'c': System.out.println("c ");
            case 'b': System.out.println("b ");
            default: System.out.println("done");
        }

        final int a =1;
        final int b;
        b =2;
        int x = 0;
        switch(x) {
            case a:
            // case b: // compiler error
        }

    }
}
