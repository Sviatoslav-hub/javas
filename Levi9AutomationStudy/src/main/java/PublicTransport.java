
public abstract class PublicTransport {
    // взнати що таке протектед.
    protected int places;
    protected int transferCost;
    protected String destination;


    protected static void alarm (){
        System.out.println("Alarm!!!!");
    }

    protected static void clickButton(String element){
        System.out.println("clicks element");
    }


    protected abstract void methodDelivery();

    public abstract void methodPlaces();

    public abstract void methodTransferCost();

    public abstract void methodName();


}



