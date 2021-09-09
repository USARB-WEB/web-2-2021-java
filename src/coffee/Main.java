package coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String coffeeType = "";
        coffeeMachine.showInfo("Please insert banknote");
        if(coffeeMachine.pay(5)){
            coffeeMachine.showInfo("Please chose option");
            coffeeType = coffeeMachine.choose(1);
            coffeeMachine.showInfo(
                    "You choose is: " + coffeeType
            );
            coffeeMachine.showInfo("Preparing...");
            coffeeMachine.showInfo(
                    "Done: " + coffeeMachine.prepare(coffeeType)
            );
        } else {
            coffeeMachine.showInfo("Please insert correct banknote");
        }



    }
}
