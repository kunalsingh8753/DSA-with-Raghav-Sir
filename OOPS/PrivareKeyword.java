class Students{
    String name;
    int age;
    private int rno = 45;

    void print(){
        System.out.println(name+" "+age+" "+rno);
    }
    // public void p(){
    //     print();
    // }

    int getRno(){      // Getter
        return rno;
    }

    void setRno(int x){
        rno =x;
    }
}
public class PrivareKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();

        // s1.p();

        s2.age=23;
        s2.name="Raghav";
        //s2.p();
        s1.setRno(34);
        s1.getRno();
        s2.setRno(45);
        s2.getRno();
        s1.print();
        s2.print();

    }
}
