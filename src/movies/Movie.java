package movies;

public class Movie {
    private String name;
    private String category;


    public String getMovieName() {
        return name;
    }

    public void setMovieName(String movieName) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

}
