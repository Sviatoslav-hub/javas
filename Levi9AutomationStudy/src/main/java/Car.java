public class Car {
    int horsePower;
    int wheels;
    String color;
    String type;

    // Constructor
    public Car(int horsePower, int wheels, String type, String color) {
        this.horsePower = horsePower;
        this.wheels = wheels;
        this.color = color;
        this.type = type;
    }

    public Car(int horsePower, int wheels) {
        this.horsePower = horsePower;
        this.wheels = wheels;
    }
    //OverLoad method
    public void methodStart(String color) {
        this.color = color;
        System.out.println("Car Start! " + color);
    }
    public void methodStop(){
        System.out.println("Car Stops!");
    }
    public void methodTurnLeft(){
        System.out.println("Car turned Left");
    }
    public void methodTurnRight(){
        System.out.println("Car turned Right");
    }
    //OverLoad methodStart
    public void methodStart() {
        System.out.println("Car Start!");
    }

    public static void main(String[] args) {
        Car Volvo = new Car(500, 4, "D class", "Black");
        Car Renaut = new Car(500,6);
        Volvo.methodStart("black");
        Volvo.methodTurnLeft();
        Volvo.methodTurnRight();
        Volvo.methodStop();
        Renaut.methodStop();
        Renaut.methodStart();
    }
}

