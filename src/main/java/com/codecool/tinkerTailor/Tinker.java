package com.codecool.tinkerTailor;

import java.util.ArrayList;
import java.util.List;

public class Tinker {

    private int numberOfPlayers;
    private int counting;
    private int startPlayerIndex = 0;
    private List<Player> playerList;

    public Tinker(int numberOfPlayers, int counting) {
        this.numberOfPlayers = numberOfPlayers;
        this.counting = counting;
        playerList = createPlayers(numberOfPlayers);
    }

    public int getWiner(){
        int index = 0;
        while (playerList.size() > 1){

            if(index > playerList.size() - 1){
                index = 0;
            }

            index +=counting -1; //because we count myself
            while (index > playerList.size() - 1) {
                index = index - (playerList.size() - 1) - 1;
            }
            playerList.remove(index);
        }
        return playerList.get(0).getPlayerName();
    }

    private List<Player> createPlayers(int numbersOfPlayers) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= numbersOfPlayers; i++) {
            players.add(new Player(i));
        }

        return players;
    }

}
