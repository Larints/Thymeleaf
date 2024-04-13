package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.model.Game;
import com.example.thymeleaf.repository.GameRepository;
import com.example.thymeleaf.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    @Override
    public Game addGame(Game game) {
        return gameRepository.addGame(game);
    }

    @Override
    public Game getGame(int id) {
        return gameRepository.getGames().get(id -1);
    }

    @Override
    public void removeGame(int id) {
        gameRepository.getGames().remove(id);
    }

    @Override
    public Game updateGame(int id, Game game) {
        Game oldGame = gameRepository.getGames().get(id);
        oldGame.setName(game.getName());
        oldGame.setDescription(game.getDescription());
        gameRepository.addGame(oldGame);
        return oldGame;
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.getGames();
    }

}
