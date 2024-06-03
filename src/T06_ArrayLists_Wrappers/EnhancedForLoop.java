package T06_ArrayLists_Wrappers;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        double[][] schülerNoten = {
                { 1.7, 2.0, 3.0, 3.3, 1.3 },   // 2.26
                { 2.3, 1.0, 2.3, 4.0, 2.7 },   // 2.46
                { 2.7, 2.3, 2.0, 5.0, 3.0 }    // 3.0
        };
        System.out.println("Arrays.toString(schülerNoten) = " + Arrays.toString(schülerNoten));
        System.out.println("Arrays.deepToString(schülerNoten) = " + Arrays.deepToString(schülerNoten));
        System.out.println("=======================");

        //iteration(schülerNoten);
        //iteration1(schülerNoten);
        iterationOneSubarray(schülerNoten);

    }

    private static void iterationOneSubarray(double[][] schülerNoten) {
        for(double n : schülerNoten[0]) {
            System.out.println(n);
        }
    }

    private static void iteration1(double[][] schülerNoten) {
        for(double[] n : schülerNoten) {
            System.out.println(n + " " + Arrays.toString(n));
        }
    }

    private static void iteration(double[][] schülerNoten) {
        System.out.println("--for-Loop--");
        for(double[] n : schülerNoten) {
            for(double n1 : n) {
                System.out.println(n1 + " ");
            }
        }
    }
}
