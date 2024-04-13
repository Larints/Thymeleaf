package com.example.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Game {

    private int id;

    private String name;

    private String description;
}
