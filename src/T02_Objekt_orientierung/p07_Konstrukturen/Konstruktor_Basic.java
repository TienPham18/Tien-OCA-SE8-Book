package T02_Objekt_orientierung.p07_Konstrukturen;

// zwei schlüssel Punkte über Konstruktoren soll man daran erinnen
// 1. er hat keine "return" typ (sogar "void")
// 2. er hat gleichen name mit die


// Schlüsselregel für "overloaded Konstruktor:
// die erste Zeile in der Konstruktor muss eine "super()" oder "this()" sein
public class Konstruktor_Basic {
}

class Foo1 {
    Foo1() { } // die konstruktor für die klass Foo
    // oder wie eine Konstruktor aufrufen wenn

}

class Foo2 {
    int size;
    String name;
    Foo2(String name, int size){
        this.name = name;
        this.size = size;
    }
}

class Patient {
    String name;
    int age;
    float height;

    public Patient(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}