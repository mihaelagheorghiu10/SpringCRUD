package com.example.SpringCRUD.controllers;

import com.example.SpringCRUD.models.FootballPlayer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    @GetMapping
    public List<FootballPlayer> getAllPlayers(){
        return this.playerList;
    }

    @GetMapping("{id}")
    public FootballPlayer getPlayerById(@PathVariable UUID id){
//        for(FootballPlayer player:this.playerList){
//            if(player.getId().equals(id)){
//                return player;
//            }
//        }
//        return null;
        return this.playerList.stream()
                .filter(
                        player->player.getId()
                                .equals(id))
                .findFirst()
                .get();
    }




}
