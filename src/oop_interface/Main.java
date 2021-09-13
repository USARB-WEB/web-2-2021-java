package oop_interface;

public class Main {
    public static void main(String[] args) {
        DemoPhoneInterface demoPhone = new Phone();
        demoPhone.callNumber("112");
        demoPhone.sendMessage("112", "Hello Police");

        SuperPhoneInterface superPhone = new Phone();
        superPhone.callNumber("112");
        superPhone.sendMessage("112", "Hello Police");
        superPhone.superFunction("112");
    }
}
