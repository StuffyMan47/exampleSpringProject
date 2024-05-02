package com.example.example;

import java.util.ArrayList;
import java.util.List;


public class DataBase {
    private List<FootballPlayer> footballPlayers;

    public DataBase(){
        footballPlayers = new ArrayList<>();
    }
    public void addFootballPlayer(FootballPlayer player){
        footballPlayers.add(player);
    }
    public void deleteFootballPlayer(FootballPlayer player){
        footballPlayers.remove(player);
    }

    public List<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }
}
