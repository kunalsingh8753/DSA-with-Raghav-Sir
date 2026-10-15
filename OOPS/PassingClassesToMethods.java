public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        Double length;
        String type;

        void print(){
            System.out.println(seats + " " + name + " "+ length + " " + type );
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.seats=34;
        c.name="chiku";
        c.length=45.7;
        c.type="SUV";

        change(c);
        System.out.println(c.seats);

        c.print();

    }
    private static void change(Car x){
        x.seats=78;
    }
}
