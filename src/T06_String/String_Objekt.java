package T06_String;

public class String_Objekt {
    public static void main(String[] args) {
        // "abc" ist eine "String objekt"
        // s ist eine "String referenz variable"
        // s2 ist eine "String referenz variable"
        String s = "abc"; // erzeugt eine neues String objekt mit der werte "abc" und zu "s" zuweisen
        String s2 = s;
        s = s.concat("def");
        System.out.println("s = " + s); // abcdef
        System.out.println("s2 = " + s2); // abc

        System.out.println("================");
        String x = "Java";
        x.concat(" Rule!"); // neue Objekt "Java Rule!" ist erzeugt aber es ist nicht zugewiesen, deshalb bleibt die werte noch "Java"
        // x = x.concat(" Rule!!!"); => neue Objekt "Java Rule!" ist erzeugt und alter objekt "Java" ist gelöscht
        System.out.println("x = " + x); // Java
        x.toUpperCase();
        // x = x.toUpperCase();
        System.out.println("x = " + x); // Java
        // x = x.replace('a', 'X');
        x.replace('a', 'X');
        System.out.println("x = " + x); // Java

        System.out.println("================");
        String y = "abcdef";
        String y2 = y;
        y = s.concat("more stuff!!!");
        System.out.println("y = " + y);
        System.out.println("y2 = " + y2);
    }
}
