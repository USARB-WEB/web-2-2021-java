package oop_interface;

public class Phone implements DemoPhoneInterface, SuperPhoneInterface{
    public void callNumber(String number){
        System.out.println("Calling " + number);
    }

    public void sendMessage(String number, String message){
        System.out.println("Send message to " + number + ". Message: " + message);
    }

    public void superFunction(String number){
        System.out.println("Execute superFunction for " + number);
    }
}
