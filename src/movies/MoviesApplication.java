package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    private static MoviesArray movieList = new MoviesArray();
    private static Movie[] allMovies = movieList.findAll();
    private static Input input = new Input();

    public static Movie[] addMovie(Movie[] movies, Movie movie){
        Movie[] movies1 = Arrays.copyOf(movies, movies.length + 1);

        movies1[movies1.length - 1] = movie;
        allMovies = movies1;

        return allMovies;
    }

    public static void getAllMovies(Movie[] allMovies) {
        for(Movie element : allMovies) {
            System.out.printf("%s -- %s %n", element.getMovieName(), element.getCategory());
        }
    }

    public static void getAnimated(Movie[] allMovies) {
        for(Movie element : allMovies) {
            if(element.getCategory().equals("animated")) {
                System.out.printf("%s -- %s %n", element.getMovieName(), element.getCategory());
            }
    }
    }

    public static void getScifi(Movie[] allMovies) {
        for(Movie element : allMovies) {
            if(element.getCategory().equals("scifi")) {
                System.out.printf("%s -- %s %n", element.getMovieName(), element.getCategory());
            }
        }
    }

    public static void getDrama(Movie[] allMovies) {
        for(Movie element : allMovies) {
            if(element.getCategory().equals("drama")) {
                System.out.printf("%s -- %s %n", element.getMovieName(), element.getCategory());
            }
        }
    }

    public static void getHorror(Movie[] allMovies) {
        for(Movie element : allMovies) {
            if(element.getCategory().equals("horror")) {
                System.out.printf("%s -- %s %n", element.getMovieName(), element.getCategory());
            }
        }
    }

    public static void addMovieInput(){
        System.out.print("Add a movie name ");
        String userMovieName = input.getString();

        System.out.print("Add category: ");
        String userCategory = input.getString();

        Movie movie = new Movie(userMovieName, userCategory);
        addMovie(allMovies, movie);
    }

    public static void userMenu() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a movie");
        System.out.print("Enter a choice: ");
    }


    public static void main(String[] args) {
        Input input = new Input();
        int userInput;

        do {
            userMenu();

            userInput = input.getInt(0, 6);

            switch (userInput) {
                case 1:
                    getAllMovies(allMovies);
                    break;
                case 2:
                    getAnimated(allMovies);
                case 3:
                    getDrama(allMovies);
                case 4:
                    getHorror(allMovies);
                case 5:
                    getScifi(allMovies);
                case 6:
                    addMovieInput();
            }
        } while(userInput != 0);

        System.out.println("Bye have a wonderful time!");






    }
}
