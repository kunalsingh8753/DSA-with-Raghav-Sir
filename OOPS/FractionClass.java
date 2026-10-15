class Fraction{
    int num;
    int den;
    Fraction(int num , int den){
        this.num=num;
        this.den=den;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){
        num=num*f.den + den*f.num;
        den = den * f.den;
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        f1.print();
        Fraction f2 = new Fraction(7, 1);
        f2.print();
    }
}
