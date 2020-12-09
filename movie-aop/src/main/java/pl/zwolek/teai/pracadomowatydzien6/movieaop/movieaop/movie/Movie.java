package pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.movie;

public class Movie {

    private String name;
    private int year;
    private String producer;

    public Movie(String name, int year, String producer) {
        this.name = name;
        this.year = year;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getProducer() {
        return producer;
    }
}
