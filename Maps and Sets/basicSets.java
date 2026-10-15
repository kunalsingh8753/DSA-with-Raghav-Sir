import java.util.HashMap;
import java.util.HashSet;

public class basicSets{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.print("set size"+set.size());
        //search-true/false
        System.out.println(set.contains(100));
        System.out.println(set);
        set.remove(100);
        System.out.println(set);
        set.remove(122); // agar set me ele nahi hai to error nhi dega

        Object[] arr = set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}