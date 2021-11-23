public class Dog {
    int size;
    String breed;
    String name;
    public void methodbark(){
        System.out.println("Woof, woof");
    }
    class DogTestDrive {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.size = 40;
            d.methodbark();
        }
    }
}
