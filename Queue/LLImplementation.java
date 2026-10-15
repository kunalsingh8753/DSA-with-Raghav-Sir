public class LLImplementation {
    public static class Node{ // user defined data type
        int val;
        Node next; 
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size =0;
        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;  
            }
            return head.val;
        }
        public int remove(){
            if(head==null){
                System.out.println("queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;

        }
        public void display(){
            if(head==null){
                System.out.println("queue is empty");
            }
            else{
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp = temp.next;
                }
            }
        }
        public boolean isEmpty(){
            if(head==null) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.display();
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        System.out.println(q.size);
    }
}
