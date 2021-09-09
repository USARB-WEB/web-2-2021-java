package coffee;

public class CoffeeMachine {
    public Boolean pay(Integer banknoteNominal){
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    public String choose(Integer option){
        if(option == 1){
            return "Coffee";
        } else if(option == 2){
            return "Cappuccino";
        }
        return "Incorrect option";
    }

    public void showInfo(String message){
        System.out.println(message);
    }

    public String prepare(String coffeeType){
        return coffeeType;
    }
}
