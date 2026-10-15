import java.util.HashSet;

public class AddSameInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Kunal");
        set.add("Raghav");
        set.add("Ansh");
        set.add("Varun");
        set.add("Aniket");
        set.add("Kunal"); // duplicate
        set.add("Kunal"); // duplicate
        System.out.println(set);
    }
}
