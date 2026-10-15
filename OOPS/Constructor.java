public class Constructor {
    public static class Car {
        int price;
        int seats;
        String name;
        int length;

        Car(){    // Defult constructor

        }

        Car(int x , String s , int l){    // parametarized constructor
            seats=x;
            name=s;
            length=l;
        }
        Car(String s , int x){  // const overLoading
            name=s; 
            seats=x;
        }
        Car(int x , String s){   // const OverLoading
            seats=x;
            name=s;
        }
        void p(){
            System.out.println(name + " " + seats);
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
        
    }
    public static void main(String[] args) {
        Car c1 = new Car(35, "Maruti", 34);
        c1.print();
        Car c2 = new Car(0, null, 0);
        c2.print();
        Car c3 = new Car("Swift", 5);
        c3.p();
        Car c4 = new Car(5,"Swift");
        c4.p();

    } 
}
