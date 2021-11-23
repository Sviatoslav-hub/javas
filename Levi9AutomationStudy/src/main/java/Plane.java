public class Plane extends PublicTransport {

    public Plane(String destination) {
        this.places = places;
        this. transferCost = transferCost;
        this.destination = destination;
    }

    public static void main(String[] args) {
        Plane Air = new Plane("Lviv");
        Air.methodPlaces(55);
        Air.methodDelivery("Lviv");
        Air.methodTransferCost(50);

        }

    }




