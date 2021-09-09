package coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.showInfo("Please insert banknote");
        if(coffeeMachine.pay()){
            coffeeMachine.showInfo("Please chose option");
        } else {
            coffeeMachine.showInfo("Please insert correct banknote");
        }

        coffeeMachine.choose();
        coffeeMachine.prepare();
    }
}
