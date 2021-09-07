package hello;

public class Bus extends Transport{
    Bus(){
        this.name = "Bus";
    }

    void run(){
        System.out.println(this.name + " move on Rails");
    }
}
