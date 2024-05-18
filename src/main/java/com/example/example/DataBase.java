package com.example.example;

import java.util.ArrayList;
import java.util.List;


public class DataBase {
    private List<FootballPlayer> footballPlayers;
    private List<FootballCommand> footballCommand;

    public DataBase(){
        footballPlayers = new ArrayList<>();
        footballCommand = new ArrayList<>();
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

    public void addFootballCommand(FootballCommand command){
        footballCommand.add(command);
    }
    public void deleteFootballCommand(FootballCommand command){
        footballCommand.remove(command);
    }

    public List<FootballCommand> getFootballCommands() {
        return footballCommand;
    }
}
