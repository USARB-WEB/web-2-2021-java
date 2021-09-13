package abstract_class;

public class Bird extends Animal{
    Bird(){
        this.type = "Bird";
    }

    public void eat(){
        System.out.println("Bird eat seeds");
    }
}
