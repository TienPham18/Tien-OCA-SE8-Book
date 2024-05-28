package T02_Objekt_orientierung.p07_Konstrukturen.DefaultKonstrukturen;

public class Clothing {
    Clothing(String s) {}
}

class TShirt extends Clothing {
    TShirt() {
        //super(); // Expected 1 arguments but found 0
        super("TShirt");
    }
}
