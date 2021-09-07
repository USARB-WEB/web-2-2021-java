package hello;

public class APP {
    public static void main(String[] args) {
        Transport transport = new Transport();
        Transport t2 = new Transport("Bus");
        System.out.println(transport.getName());
    }
}
