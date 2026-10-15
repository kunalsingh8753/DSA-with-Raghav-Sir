public class ThisKeyword {
    public static class Car {
        int price;
        int seats;
        String name;
        int length;

        Car(){    // Defult constructor

        }

        Car(int seats , String name , int length){    // parametarized constructor
            this.seats=seats;
            this.name=name;
            this.length=length;
        }
        Car(String name , int seats){  // const overLoading
            this.name=name; 
            this.seats=seats;
        }
        Car(int seats , String name ){   // const OverLoading
            this.seats=seats;
            this.name=name;
            this.price=price;
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
        Car c4 = new Car(5,"Swift",78654);
        c4.p();

    } 
}
