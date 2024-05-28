package T02_Objekt_orientierung.p07_Konstrukturen.DefaultKonstrukturen.NoArgument;

public class Animal {
    Animal() { } // does not matter to explicit or implicitly define no-argument constructor. the super() in line 9 is NO COMPILER ERROR
}

class Horse extends Animal {
    Horse() {
        //super(); // super() implicitly is defined.
    }
}
