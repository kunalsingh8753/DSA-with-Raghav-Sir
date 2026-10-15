import java.util.Stack;
public class BasicSTLofStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Khushi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        System.out.println(st.size());
        System.out.println(st);  
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.println(st);
    }
}
