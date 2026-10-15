public class reverse {
    public static int rev(int n , int r){
        if(n==0) return r;
        return rev(n/10 , r*10+n%10);
    }
    public static void main(String[] args) {
        int n = 3456;
        int r=0;
        System.out.println(rev(n, r));

    }
}
