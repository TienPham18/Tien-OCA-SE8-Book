package T05_FlowControl_Exceptions.p01_ControlFlow.DecisionMakingStatement.Switch;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        switch (x) {
            case 0: {
                y =7;
            }
        }

        // String "equality"
        String s = "MONDAY"; // String are case-sensitive, does not match -> print nothing
        switch (s) {
            case "Monday": {
                System.out.println("Monday");
            }
        }
    }
}
