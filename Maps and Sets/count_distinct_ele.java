import java.util.HashSet;

public class count_distinct_ele {
    public static int distinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
         System.out.println(set.size());
    }
}
