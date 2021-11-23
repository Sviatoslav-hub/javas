public class Auto extends PublicTransport{
    public Auto(String destination){
        this.destination = destination;
        this.places = places;
    }

    public static void main(String[] args) {
        Auto BMW = new Auto("Lviv");
        BMW.methodDelivery("Kiev");
        BMW.methodPlaces(3);
        BMW.methodTransferCost(30);
    }

}
