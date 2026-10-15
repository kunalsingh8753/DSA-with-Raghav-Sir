import java.util.ArrayList;
import java.util.List;

public class printPermutations {
    public static void print(String str , String s , List<String> l){
        int n = str.length();
        if(str.equals("")){
            l.add(s);
            return ;
        }
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1, n);
            String rem = left+right;
            print(rem, s+ch, l);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> l = new ArrayList<>();
        print(str , "",l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    
}
