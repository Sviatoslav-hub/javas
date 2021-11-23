public class Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("Start the film");
    }
}
    class MovieTestDrive {
        public static void main(String[] args) {
            Movie one = new Movie();
            one.title = "How to do?";
            one.genre = "Comedy";
            one.rating = -2;
            Movie two = new Movie();
            two.title = "Venum";
            two.genre = "Comics";
            two.rating = 10;
            Movie three = new Movie();
            three.title = "Lord of The Rings";
            three.genre = "Fantacy";
            three.rating = 100;

        }
    }