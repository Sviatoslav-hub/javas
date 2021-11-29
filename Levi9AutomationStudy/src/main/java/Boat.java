public class Boat extends PublicTransport {

    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;
    private int horsPower;

    public Boat(String destination, int places, int transferCost, int length, String name, int horsPower){
        this.length = length;
        this.name = name;
        this.horsPower = horsPower;
        this.destination = destination;
        this.places = places;
        this.transferCost = transferCost;
    }




    @Override
    protected void methodDelivery() {
        System.out.println("I'm sailing to the " + destination + " place");

    }

    @Override
    public void methodPlaces() {
        System.out.println("On my board are " + places + " peoples");

    }

    @Override
    public void methodTransferCost() {
        System.out.println("This transfer costs " + transferCost +" dollars");

    }

    public void methodLength(){
        System.out.println("My length is "+ length + " meters");
    }
    public void methodName() {
        System.out.println("My Name is " + name);
    }

        public void methodHorsePower(){
        System.out.println("I have " + horsPower + " Powers");
    }

    public static void main(String[] args) {
        Boat Kater = new Boat("Valhalla", 50, 2, 3, "Drakar", 500);
        Kater.methodDelivery();
        Kater.methodHorsePower();
        Kater.methodLength();
        Kater.methodName();
        Kater.methodPlaces();
        Kater.methodTransferCost();
        System.out.println(Kater.getName());
        Kater.setName("Killer");
        System.out.println(Kater.getName());
    }


}
