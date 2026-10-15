class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Stack{
    Node head;
    int len;
    int pop() throws Exception{ 
        if(head==null){
            throw new Exception("Stack underflow error ");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    int peek() throws Exception{
        if(head==null){
            throw new Exception(" stack underflow error");
        }
        return head.val;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else{
            temp.next=head;
            head=temp;
        }
        len++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception{
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println();
        System.out.println(st.peek());
    }
}
