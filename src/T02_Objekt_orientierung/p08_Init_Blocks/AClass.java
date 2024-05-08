package T02_Objekt_orientierung.p08_Init_Blocks;

public class AClass {
    private static String str = "a string";

    // static Init-Blocks
    static {
        str = "another string";
    }

    public AClass() {
        str = "yet another string";
    }

    public static String getStr() {
        return str;
    }

    public static void main(String[] args) {
        System.out.println("AClass.str = " + AClass.str);
        System.out.println("AClass.getStr() = " + AClass.getStr());
    }
}
