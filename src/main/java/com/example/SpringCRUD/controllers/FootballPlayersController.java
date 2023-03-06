package com.example.SpringCRUD.controllers;

import com.example.SpringCRUD.models.FootballPlayer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/players")
public class FootballPlayersController {
    List <FootballPlayer> playerList = new ArrayList<>(List.of(
            new FootballPlayer("Lionel Messi" ),
            new FootballPlayer("Cristiano Ronaldo" ),
            new FootballPlayer("Neymar Jr." ),
            new FootballPlayer("Andrés Iniesta" ),
            new FootballPlayer("Dani Alves" )

    ) );

}
