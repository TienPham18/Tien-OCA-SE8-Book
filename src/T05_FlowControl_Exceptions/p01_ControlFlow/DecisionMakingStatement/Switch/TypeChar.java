package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch;

public class TypeChar {
    public static void main(String[] args) {
        int x = 1; // compile but print nothing in console
        //Integer x = 1; // Compiler-error
        switch (x) { // switch expression type int and case label value of type char
            case 'a':
                System.out.println("a");
        }

        // a byte might have negative values
        char ch = 'x';
        switch(ch){
            // case -1 : System.out.println("-1"); break; // case -1 compiler-error

            default: System.out.println("default");
        }
    }
}
