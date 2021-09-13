package abstract_class;

public abstract class Animal {
    protected String type = null;

    Animal(){
        this.type = null;
    }

    Animal(String type){
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void eat(){
        System.out.println("Animal eat something");
    }
}
