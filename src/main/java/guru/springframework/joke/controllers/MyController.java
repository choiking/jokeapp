package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    private JokeService jokeService;

    public MyController(JokeService jokeService) {

        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String sayJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
