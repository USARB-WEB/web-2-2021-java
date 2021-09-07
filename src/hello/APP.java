package hello;

public class APP {
    public static void main(String[] args) {
        Transport transport = new Transport();
        Transport t2 = new Transport("Bus");
        System.out.println(transport.getName());
        transport.setName("Train");
        System.out.println(transport.getName());
        Train train = new Train();
        System.out.println(train.getName());
        Bus bus = new Bus();
        System.out.println(bus.getName());

        Bus redBus = new Bus();
        redBus.paint("red");
        System.out.println("Red Bus body color is: " + redBus.getBodyColor());
        System.out.println("Red Bus wheel color is: " + redBus.getWheelColor());

        Bus redBlueBus = new Bus();
        redBlueBus.paint("red", "blue");
        System.out.println("Red Blue Bus body color is: " + redBlueBus.getBodyColor());
        System.out.println("Red Blue Bus wheel color is: " + redBlueBus.getWheelColor());

    }
}
