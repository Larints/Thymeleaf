package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Game;
import com.example.thymeleaf.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/games")
public class GameController {

    private final GameService service;

    @GetMapping ()
    public String getAllGames(Model model) {
        List<Game> games = service.getAllGames();
        model.addAttribute("games", games);
        return "all-games";
    }


    @GetMapping("/add-game")
    public String addGameForm(){
        return "add-game";
    }

    @PostMapping("/add-game")
    public String addGame(@RequestBody Game game, Model model) {
        model.addAttribute("games", service.getAllGames());
        service.addGame(game);
        return "all-games";
    }


    @GetMapping("/{id}")
    public String getGame(@PathVariable int id, Model model) {
        model.addAttribute("games", service.getGame(id));
        return "game";
    }

    //TODO:
//    @PostMapping("/{id}")
//    public String removeGame(int id) {
//        service.removeGame(id);
//        return "Success";
//    }


    //TODO:
    @PostMapping("/updateGame")
    public Game updateGame(int id, Game game) {
        return service.updateGame(id, game);
    }

}
