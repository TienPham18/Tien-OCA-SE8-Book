package T06_String_StringBuilder.s02_StringBuilder;

public class StringBuilderMethod {

    public static void main(String[] args) {
        System.out.println("original sb: 012345678");
        System.out.println("=======================");

        append();
        delete();
        insertOffset();
        reverse();
        toString1();

        StringBuilder sb = new StringBuilder(5);
        System.out.println("sb = " + sb);
    }

    private static void append() {
        StringBuilder sb = new StringBuilder("012345678");
        sb.append("9"); // append(String s)
        System.out.println("append(): " + sb);
    }

    private static void delete() {
        StringBuilder sb = new StringBuilder("012345678");
        sb.delete(3,6); // delete(int start, int end)
        System.out.println("delete(3,6): " + sb);
    }

    private static void insertOffset() {
        StringBuilder sb = new StringBuilder("012345678");
        sb.insert(4, "---"); // insert(int offset, String s)
        System.out.println("insertOffset(4, ---): " + sb);
    }

    private static void reverse() {
        StringBuilder sb = new StringBuilder("012345678");
        sb.reverse(); // reverse()
        System.out.println("reverse(): " + sb);
    }
    private static void toString1() {
        StringBuilder sb = new StringBuilder("012345678");
        sb.toString(); // toString()
        System.out.println("toString(): " + sb);
    }
}
