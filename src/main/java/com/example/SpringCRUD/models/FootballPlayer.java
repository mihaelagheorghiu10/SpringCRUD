package com.example.SpringCRUD.models;

import java.util.UUID;

public class FootballPlayer {
    private UUID id;
    private String name;

    public FootballPlayer(String name) {
        this();
        this.name = name;
    }

    public FootballPlayer() {
        this.id = UUID.randomUUID();

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
