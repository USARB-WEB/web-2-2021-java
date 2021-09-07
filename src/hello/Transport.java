package hello;

public class Transport {
    protected String name;
    private String bodyColor = "white";
    private String wheelColor = "black";
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

    String getBodyColor(){
        return this.bodyColor;
    }

    void run(){
        System.out.println(this.name + " move on UNDEFINED");
    }

    void paint(String bodyColor){
        this.bodyColor = bodyColor;
    }
}
