class Node{
    int val;
    Node next;  
    Node(int val){
        this.val=val;
    }
}
public class DisplayList {
    // public static void displayRec(Node head){
    //     Node temp = head;
    //     if(temp==null  ) return ;
    //     System.out.println(temp.val); 
    //     displayRec(temp.next);                                                          
    // }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;   // very important
    }

        // using for loop
        // for(Node temp = head ; temp!=null; temp=temp.next){
        //     System.out.println(temp.val);
        // }
    }
    
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        // System.out.println(get(a, 3));
    }
    // private static int get(Node head , int idx){
    //     Node temp = head;
    //     for(int i=0; i<=idx;i++){
    //         temp=temp.next;
    //     }
    //     return temp.val;
    // }
}
