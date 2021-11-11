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

    public static void main(String[] args) {
        Car Volvo = new Car(500, 4, "D class", "Black");
    }

    public static void methodStart() {
        System.out.println("Car drive!");
    }

}

