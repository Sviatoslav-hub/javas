public class Car {
    int horsePower;
    int wheels;
    String color;
    String type;

    public Car(int horsePower, int wheels, String type, String color) {
        this.horsePower = horsePower;
        this.wheels = wheels;
        this.color = color;
        this.type = type;
    }
    public void methodStart() {
        System.out.println("Car Start!");
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

    public static void main(String[] args) {
        Car Volvo = new Car(500, 4, "D class", "Black");
        Volvo.methodStart();
        Volvo.methodTurnLeft();
        Volvo.methodTurnRight();
        Volvo.methodStop();
    }
}

