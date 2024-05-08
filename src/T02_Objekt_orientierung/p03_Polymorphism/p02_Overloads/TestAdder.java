package T02_Objekt_orientierung.p03_Polymorphism.p02_Overloads;

public class TestAdder {
    public static void main(String[] args) {
        Adder a = new Adder();
        // addThem() method to add ints
        int b = 27;
        int c = 23;
        int intResult = a.addThem(b, c);
        System.out.println("intResult = " + intResult);

        // addThem() method to add doubles
        double doubleResult = a.addThem(22.8, 2.1);
        System.out.println("doubleResult = " + doubleResult);
    }
}

class Adder {
    public int addThem(int x, int y) {
        return x + y;
    }

    // Overload the addThem() method to add doubles instead of ints
    public double addThem(double x, double y) {
        return x + y;
    }
}
