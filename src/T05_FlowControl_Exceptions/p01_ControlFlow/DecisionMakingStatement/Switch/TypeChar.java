package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch;

public class TypeChar {
    public static void main(String[] args) {
        int x = 1; // compile but print nothing in console
        //Integer x = 1; // Compiler-error
        switch (x) {
            case 'a':
                System.out.println("a");
        }
    }
}
