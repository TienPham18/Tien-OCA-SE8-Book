package T02_Objekt_orientierung.p03_Polymorphism.p03_OverloadUndOverride;

public class Exam {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.doSomething();
        Foo foo2 = new Bar();
        foo2.doSomething();
        Bar bar = new Bar();
        bar.doSomething();
        Bar bar2 = new Bar();
        bar2.doSomething("and overloaded");
    }
}

class Foo {
    void doSomething() {
        System.out.println("doSomething from super class");
    }
}

class Bar extends Foo {
    void doSomething(String s) {
        System.out.println("doSomething from sub class " + s);
    }
}