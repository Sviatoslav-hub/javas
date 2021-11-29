public class Auto extends PublicTransport{
    public int wheels;
    public String name;

    public Auto(String destination, int places, int transferCost, int wheels, String name) {
        this.places = places;
        this.transferCost = transferCost;
        this.destination = destination;
        this.wheels = wheels;
        this.name = name;
    }
    @Override
    public void methodDelivery(){
        this.destination = destination;
        System.out.println("I'm delivering package to the " + destination + " city");
    }

    @Override
    public void methodPlaces() {
        this.places = places;
        System.out.println("I'm have only " + places + " places");

    }

    @Override
    public void methodTransferCost() {
        this.transferCost = transferCost;
        System.out.println("This transfer costs " + transferCost + " dollars");

    }
    @Override
    public  void methodName(){
                this.name = name;
        System.out.println("The name of the car is " + name);
    }

    public static void main(String[] args) {
        Auto BMW = new Auto("Kiev", 4,30,4, "BMW M5");
        Auto Renaut = new Auto("Lviv",3,20,4,"Megane");
        BMW.methodDelivery();
        BMW.methodPlaces();
        BMW.methodTransferCost();
        BMW.methodName();
        System.out.println();
        Renaut.methodDelivery();
        Renaut.methodPlaces();
        Renaut.methodTransferCost();
        Renaut.methodName();

    }
}
