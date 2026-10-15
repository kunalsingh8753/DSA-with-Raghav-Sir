public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
        

    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,7,6,4};
        StudentData s1 = new StudentData(arr.length);
        StudentData s2 = new StudentData(arr.length);
        s1.marks[0] =67;
        s1.marks[1]=87;
        s1.marks[2]=89;
        s1.marks[3]=98;

        System.out.println(arr[0]);

    }
}
