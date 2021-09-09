package coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String coffeType = "";
        coffeeMachine.showInfo("Please insert banknote");
        if(coffeeMachine.pay(5)){
            coffeeMachine.showInfo("Please chose option");
            coffeType = coffeeMachine.choose(1);
            coffeeMachine.showInfo(
                    "You choose is: " + coffeType
            );
            coffeeMachine.showInfo("Preparing...");
            coffeeMachine.showInfo(
                    "Done: " + coffeeMachine.prepare(coffeType)
            );
        } else {
            coffeeMachine.showInfo("Please insert correct banknote");
        }



    }
}
