public class rec_on_arr {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,4,3,7,8,5};
        
        printrec(arr, 0);
        int ele = 100;
        System.out.println(exists(arr, ele, 0));
    }

    public static void printrec(int[] arr , int idx){
        int n = arr.length;
        if(idx==n) return;
        System.out.println(arr[idx]);
        printrec( arr, idx+1);
    }

    public static boolean  exists(int[] arr , int ele , int idx){
        int n = arr.length;
        if(arr[idx] == ele) return true;
        if(idx==n) return false;
        return exists(arr, ele, idx+1);
    }
}
