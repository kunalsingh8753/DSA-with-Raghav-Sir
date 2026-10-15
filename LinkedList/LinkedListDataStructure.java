class Node{    
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head == null) return;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
    }
    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val == val)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void insert(int val , int idx){
        if(idx<0 || idx>size){
            System.out.println("invalid index");
            return;
        }
        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            Node t = new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    void delete(int idx){
        if(idx>size || idx<0){
            System.out.println("invalid idx you entered");
            return;
        }
        if(idx==0) deleteAtHead();
        else{
            Node temp = head;
            for(int i=1 ; i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--; 
            if(idx==size-1){
                tail=temp;
                size--;
            }
        }
    }
}

public class LinkedListDataStructure {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.display();
        ll.addAtHead(5);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println("Size = " + ll.size);
        System.out.println("Index = " + ll.search(30));
        ll.insert(2, 2);
        ll.insert(45, 4);
        ll.display();
        ll.delete(3);
        ll.display();
    }
}