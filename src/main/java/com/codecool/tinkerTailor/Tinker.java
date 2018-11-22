package com.codecool.tinkerTailor;

import java.util.ArrayList;
import java.util.List;

public class Tinker {

    private int counting;
    private List<Player> playerList;

    public Tinker(int numberOfPlayers, int counting) {
        this.counting = counting;
        playerList = createPlayers(numberOfPlayers);
    }

    public int getWiner(){
        int playerIndex = 0;
        while (playerList.size() > 1){

            if(playerIndex > playerList.size() - 1){
                playerIndex = 0;
            }

            playerIndex +=counting -1; //because we count myself
            while (playerIndex > playerList.size() - 1) {
                playerIndex = playerIndex - (playerList.size() - 1) - 1;
            }
            playerList.remove(playerIndex);
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
