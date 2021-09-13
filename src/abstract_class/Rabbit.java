package abstract_class;

public class Rabbit extends Animal{
    Rabbit(){
        this.type = "Rabbit";
    }

    public void eat(){
        System.out.println("Rabbit eat carrots");
    }
}
