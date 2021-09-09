package coffee;

public class CoffeeMachine {
    public Boolean pay(Integer banknoteNominal){
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    public String choose(){
        return "";
    }

    public void showInfo(String message){
        System.out.println(message);
    }

    public String prepare(){
        return "";
    }
}
