package T02_Objekt_orientierung.Polymorphism.Overriden;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Hourse();
        Animal c = new Hourse();
        a.eat();
        b.eat();
        // c.buck(); // Compiler-Fehler weil "Animal class" keine buck() methode hat.

    }
}

class Animal {
    public void eat() {
        System.out.println("eat() method from Animal class: Generic Animal Eating Generically");
    }
}

class Hourse extends Animal {
    public void eat() {
        System.out.println("eat() method from Hourse class: Hourse Eating hay, oats");
    }

    public void buck() { }
}
