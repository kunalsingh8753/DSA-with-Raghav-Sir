class Pokemon{    // parent class
    int power;
    String type;
    Pokemon(){}
    Pokemon(String type , int power){
        this.type=type;
        this.power=power;
    }
    void print(){   //getter
        System.out.println(this.power+" "+this.type);
    }

}
class LegendaryPokemon extends Pokemon{    // child class
    String ability;
}
class StrongPokemon extends Pokemon{
    int speed;
}
class GodPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability="Pressure";
        Pokemon pikachu = new Pokemon("hjdb", 9);
        pikachu.print();
        GodPokemon dialga = new GodPokemon();
        
    }
}
