package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@AllArgsConstructor
@Getter
@Repository
public class GameRepository {

    private final Map<Integer, Game> games;

    private final AtomicInteger gameCount = new AtomicInteger();


    public List<Game> getGames() {
        games.put(1, new Game(1, "Postal", "Shooter"));
        games.put(2, new Game(2, "GTA", "Shooter"));
        games.put(3, new Game(3, "WorldOfWarcraft", "AAARPG"));
        return new ArrayList<>(games.values());
    }

    public Game addGame(Game game) {
        games.put(game.getId(), game);
        return game;
    }



}
