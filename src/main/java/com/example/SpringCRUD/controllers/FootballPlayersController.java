package com.example.SpringCRUD.controllers;

import com.example.SpringCRUD.models.FootballPlayer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    @PostMapping
    public FootballPlayer createPlayer(@RequestBody FootballPlayer player){
        this.playerList.add(player);
        return player;
    }

    @DeleteMapping("{id}")
    public FootballPlayer deletePlayerById(@PathVariable UUID id) {
//        this.playerList.removeIf(player -> player.getId().equals(id));
//        return null;
        FootballPlayer playerToDelete = this.playerList.stream().filter(player -> player.getId().equals(id)).findFirst().get();
        this.playerList.remove(playerToDelete);
        return playerToDelete;
    }

    @PutMapping("{id}")
    public FootballPlayer updatePlayerById(@PathVariable UUID id, @RequestBody FootballPlayer newPlayerData){
        FootballPlayer playerToUpdate = this.playerList.stream().filter(player -> player.getId().equals(id)).findFirst().get();
        playerToUpdate.setName(newPlayerData.getName());
        return playerToUpdate;
    }

    @GetMapping("search")
    public List<FootballPlayer> searchPlayerBy(@RequestParam(required = false)String name){
        if(name==null)return null;
        List<FootballPlayer> filteredPlayers=this.playerList.stream().filter(
                player->player.getName()
                        .toLowerCase()
                        .contains(name.toLowerCase())
        ).toList();
        return  filteredPlayers;
    }

}


