package coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.showInfo("Please insert banknote");
        coffeeMachine.pay();
        coffeeMachine.choose();
        coffeeMachine.prepare();
    }
}
