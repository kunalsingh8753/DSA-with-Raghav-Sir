
import java.util.Scanner;
public class power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int a = sc.nextInt();
        System.out.println("enter exponent");
        int b = sc.nextInt();
        System.out.println(pow(a, b));
    }
    public static int pow(int a , int b){
        if(b==0) return 1;
        int ans = a*pow(a,b-1);
        return ans;
    }
}