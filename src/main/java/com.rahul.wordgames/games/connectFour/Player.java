package com.rahul.wordgames.games.connectFour;

import org.springframework.web.socket.WebSocketSession;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private String userId;
    private String username;
    private WebSocketSession socket; 
    private char color; 

    public Player(String userId, String username, WebSocketSession socket){
        this.userId = userId;
        this.username = username;
        this.socket = socket;
    }
}
