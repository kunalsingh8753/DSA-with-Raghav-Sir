
public class gcd {
    public static int findgcd(int a , int b){
        if(a==0) return b;
        return findgcd(b%a, a);
    }
    
      

    public static void main(String[] args) {
        System.out.println(findgcd(3, 017));
    }
}