package hello;

public class Transport {
    private String name;
    Transport(){
        this.name = "Noname";
        System.out.println("I am a Transport");
    }

    Transport(String name){
        this.name = name;
        System.out.println("I am a " + name);
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }
}
