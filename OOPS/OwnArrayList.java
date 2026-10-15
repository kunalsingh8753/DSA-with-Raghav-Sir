class ArrayList{     // user defined data structure
    int[] arr;
    int idx=0;
    int size=0;
    ArrayList(){}
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx==arr.length){   // arr is full
            int[] arr2 = new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                arr2[i]= arr[i];             // copy paste
            }
            arr = arr2;
        }
        arr[idx++]=ele;
        size++;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    int get(int index){
        return arr[index];
    }
    void set(int index , int val){
        arr[index]=val; 
    }
    void removefromend(){
        idx--;
        size--;
    }
    int capacity(){
        return arr.length;
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        arr.capacity();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(2));
    }
}
