package scd.Lab10.facade;

public class HomeTheaterFacade {
    public String startMovie(String movieName) {
        return "Starting movie: " + movieName;
    }

    public String stopMovie() {
        return "Stopping movie...";
    }
}
