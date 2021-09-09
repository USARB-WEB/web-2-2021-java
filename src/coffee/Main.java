package coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.showInfo("Please insert banknote");
        if(coffeeMachine.pay(5)){
            coffeeMachine.showInfo("Please chose option");
            coffeeMachine.showInfo(
                    "You choose is: " + coffeeMachine.choose(1)
            );
        } else {
            coffeeMachine.showInfo("Please insert correct banknote");
        }


        coffeeMachine.prepare();
    }
}
