package T02_Objekt_orientierung.p08_Init_Blocks;

public class Init {
    Init(int x) {
        System.out.println("1-arg constructor");
    }
    Init() {
        System.out.println("no-arg constructor");
    }
    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        new Init(7);
        new Init();
    }
}
