package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Game;
import com.example.thymeleaf.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface GameService {


    Game addGame(Game game);

    Game getGame(int id);

    void removeGame(int id);

    Game updateGame(int id,Game game);
    
    List<Game> getAllGames();

}
