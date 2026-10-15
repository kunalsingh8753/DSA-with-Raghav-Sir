import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<>();
        while(!q.isEmpty()){
            System.out.print(q.peek());
            System.out.print(" ");
            helper.add(q.remove());
        }
        while(!helper.isEmpty()){
            q.add(helper.remove());
        }

    }

}
