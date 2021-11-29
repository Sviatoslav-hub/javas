public class Plane extends PublicTransport {
    private String name;
    private static int planeCount;

    public Plane(String destination, int places, int transferCost, String name) {
        this.places = places;
        this.transferCost = transferCost;
        this.destination = destination;
        this.name = name;
        planeCount++;
    }

    @Override
    public void methodDelivery() {
        this.name = name;
        System.out.println("I'm delivering people in plane with name: " + name);
    }

    @Override
    public void methodPlaces() {

    }

    @Override
    public void methodTransferCost() {

    }

    @Override
    public void methodName() {

    }


    public static int getPlaneCount() {
        return planeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Plane A1 = new Plane("Karaganda", 12, 350, "Antonov");
        System.out.println(getPlaneCount());
        A1.methodDelivery();
        System.out.println(A1.getName());
        A1.setName("Ryanir");
        A1.methodDelivery();
        System.out.println(A1.getName());
        Plane A2 = new Plane("Karaganda", 12, 350, "blablabla");
        System.out.println(getPlaneCount());


    }

}




