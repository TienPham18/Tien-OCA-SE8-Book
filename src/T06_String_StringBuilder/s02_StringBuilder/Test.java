package T06_String_StringBuilder.s02_StringBuilder;

public class Test {
    public static void main(String[] args) {
        createString();
        createStringBuilder();
    }

    private static void createStringBuilder() {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def"); // keine zugewiesen - no new assignment needed
        System.out.println("sb = " + sb);
    }

    private static void createString() {
        String x = "abc"; // ein Objekt
        x.concat("def"); // ein ander Objekt (ein neues Objekt "abcdef")
        x = x.concat("def"); // eine neus Objekt "abcdef" wird aber zugewiesen zu x
        System.out.println("x = " + x);
    }


}
