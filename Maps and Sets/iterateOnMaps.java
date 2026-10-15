import java.util.HashMap;

public class iterateOnMaps {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("kunal", 1);
        map.put("nehal" , 2);
        map.put("ansh",3);
        map.put("aniket",5);
        map.put("varun",8);
        for(String key : map.keySet()){
            System.out.println(key +" "+ map.get(key));
        }
        System.out.println();
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
