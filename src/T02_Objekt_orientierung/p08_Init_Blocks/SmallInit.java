package T02_Objekt_orientierung.p08_Init_Blocks;

public class SmallInit {
    static int staticVar;
    int instanceVar;

    static { // static init block
        staticVar = 42;
    }
    { instanceVar = 3; } //

}

class Test {
    public static void main(String[] args) {
        System.out.println("SmallInit.staticVar = " + SmallInit.staticVar);
        SmallInit ref = new SmallInit();
        System.out.println("ref.instanceVar = " + ref.instanceVar);

    }
}
