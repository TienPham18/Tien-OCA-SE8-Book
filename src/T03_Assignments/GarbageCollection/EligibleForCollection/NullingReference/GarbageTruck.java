package T03_Assignments.GarbageCollection.EligibleForCollection.NullingReference;

public class GarbageTruck {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb); // the StringBuffer object is not eligible for collection
        sb = null; // Now "the StringBuffer object" is eligible for collection
        System.out.println(sb);

    }
}

class Lost {
    public static void main(String[] args) {
        Lost x = new Lost(); // assign the "Lost object" to "reference x"
        x = null; // Now "the Lost object" is eligible for collection
    }
}
