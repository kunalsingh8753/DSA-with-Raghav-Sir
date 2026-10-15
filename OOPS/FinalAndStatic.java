public class FinalAndStatic {
    public static class Cricketer{
        static String country = "INDIA";
        int run;
        String name;
        Double avg;
    }
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
        c2.country="NZ";
        System.out.println(c2.country);
        
    }
}
