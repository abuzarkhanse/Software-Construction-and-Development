package scd.Lab10.facade;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facade")
public class FacadeController {

    private final HomeTheaterFacade homeTheater = new HomeTheaterFacade();

    @PostMapping("/start-movie")
    public String startMovie(@RequestParam String movieName) {
        return homeTheater.startMovie(movieName);
    }

    @PostMapping("/stop-movie")
    public String stopMovie() {
        return homeTheater.stopMovie();
    }
}
