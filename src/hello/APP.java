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
        redBus.pain("red");
        System.out.println("Bus body color is: " + redBus.getBodyColor());

    }
}
