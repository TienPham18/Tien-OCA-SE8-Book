package T03_Assignments.GarbageCollection.EligibleForCollection.ReassigningReference;

public class GarbageTruck {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("hello");
        StringBuffer s2 = new StringBuffer("goodbye");
        System.out.println("s1 = " + s1);
        // At this point the "StringBuffer object with value hello" is not eligible
        s1 = s2; // 2 reference s1 and s2 now are assigned to "StringBuffer object goodbye"
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
