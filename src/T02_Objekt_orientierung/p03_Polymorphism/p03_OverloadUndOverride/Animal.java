package T02_Objekt_orientierung.p03_Polymorphism.p03_OverloadUndOverride;

public class Animal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        //======================
        Animal a2 = new Animal();
        // a2.eat("Banana"); // Compiler-Fehler weil Animal klasse keine method eat mit argument hat
        //======================
        System.out.println("===================");
        System.out.println("Polymorphism works which eat() is called: ");
        Animal ah = new Horse(); // Polymorphism works
        ah.eat();
        //======================
        System.out.println("===================");
        Animal ah2 = new Horse();
        // ah2.eat("Banana"); // Compiler-Fehler weil Animal klasse keine method eat mit argument hat
        //======================
        System.out.println("===================");
        System.out.println("The overloaded eat(String s) method is invoked: ");
        Horse he = new Horse();
        he.eat("Apples"); // Overloaded method with different argument
        he.eat();
    }

    public void eat() {
        System.out.println("Animal Eating Generically");
    }
}

//==================
class Horse extends Animal {

    public void eat() {
        System.out.println("Horse eating hay");
    }

    public void eat(String s) {
        System.out.println("Horse eating " + s);
    }
}
