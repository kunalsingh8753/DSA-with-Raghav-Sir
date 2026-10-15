class ComplexNumber{
    int x;
    int y;

    ComplexNumber(){}
    ComplexNumber(int x , int y){
        this.x=x;
        this.y=y;
    }
    void print(){
       if(y>=0) System.out.println(x+"+ "+y+"i");
       else  System.out.println(x+" -"+(-y)+"i");
    }
    void add(ComplexNumber z){
        x += z.x;
        y += z.y;
    }
    
}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3, 6);
        z1.print();
        ComplexNumber z2 = new ComplexNumber(4, -5);
        z2.print();
        z1.add(z2);
    }
}
