package hello;

public class Transport {
    protected String name;
    Transport(){
        this.name = "Noname";
    }

    Transport(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    void run(){
        System.out.println(this.name + " move on UNDEFINED");
    }
}
