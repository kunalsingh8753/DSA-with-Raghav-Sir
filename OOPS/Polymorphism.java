public class Polymorphism {
    public static class Cat {
        void speak(){
            System.out.println("meow meow");
        }
        
    }
    public static class Dog{
        void speak(){
            System.out.println("bhau bhau ");
        }
    } 
    public static class Lion{
        void speak(){
            System.out.println("Grrrrrr ");
        }
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Lion l = new Lion();

        c.speak();
        d.speak();
        l.speak();
    }
}
