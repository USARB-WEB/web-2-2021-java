package abstract_class;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        System.out.println(rabbit.getType());
        rabbit.eat();

        Bird bird = new Bird();
        System.out.println(bird.getType());
        bird.eat();
    }
}
