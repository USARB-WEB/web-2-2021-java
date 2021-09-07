package hello;

public class Transport {
    private String name;
    Transport(){
        System.out.println("I am a Transport");
    }

    Transport(String name){
        System.out.println("I am a " + name);
    }
}
