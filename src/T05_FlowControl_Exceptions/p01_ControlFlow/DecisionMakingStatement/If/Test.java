package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.If;

public class Test {
    public static void main(String[] args) {
        int trueInt = 0;
        int falseInt = 5;
        //if (trueInt); // required type Boolean but provided type integer
        //if (1); // required type Boolean but provided type integer

        //if (trueInt == true); // Operator '==' cannot be applied to 'int', 'boolean'
        //if (falseInt == false); // Operator '==' cannot be applied to 'int', 'boolean'

        if (trueInt == 2)
            System.out.println("True");
        if (falseInt == 5)
            System.out.println("True");
    }
}
