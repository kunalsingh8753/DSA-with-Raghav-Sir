import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("kunal", 1);
        map.put("nehal" , 2);
        map.put("ansh",3);
        map.put("aniket",5);
        map.put("varun",8);
        System.out.println(map); 
        System.out.println(map.containsKey("ansh"));
        map.put("kunal", 100);    // ye pahle wale kunal pair ko delet karta hai or naya pair put karta hai
        System.out.println(map);
        map.put("raghav",1);  // value duplicate ho sakti hai  but duplicate key  nahi ho sakti
        map.get("kunal");
    }
}
