import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        int[] arr = {2,5,4,6,3,4,7,};
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for(int x :set){
            System.out.print(x+" ");
        }
        set.clear();
        System.out.println(set);
    }
}
