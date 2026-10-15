import java.util.Scanner;

public class userDefinedDatatype {
    public static class Student{
    String name;
    int rno;
    int age;
    Double cgpa;

    void print(){
        System.out.println(name + " " + rno + " " + age + " " + cgpa);
    }
   }
   public static void main(String[] args) {
    
   
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();
    s1.name = "kunal";
    s1.rno = 34;
    s1.age = 23;
    s1.cgpa = 8.15;

    Student s2 = new Student();
    s2.age=24;
    s2.cgpa=3.4;
    s2.name="nehal";
    s2.rno=01;

    // System.out.println(s1.name);

    s1.print();
    s2.print();

    print(s2);
  }
  public static void print(Student x){
    System.out.println(x.age+" "+x.name+" "+x.rno+" "+x.cgpa);
  }
}