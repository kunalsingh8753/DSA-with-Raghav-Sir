public class global_variable {
    static int x = 10; // any method can change its value
    public static void main(String[] args) {
    print();
    System.out.println(x);
    int x = 7; // ye local variable hai or agr isake niche hmm kahi bhi x ko modify kare to local variable hi modify hoga

    }
    public static void print(){
    x = 20;

        }
    
}
