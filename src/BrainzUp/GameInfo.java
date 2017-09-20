/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BrainzUp;

import java.io.Serializable;

/**
 * 
 * @author Dennis
 */
public class GameInfo implements Serializable{

    private int round;
    private int score;
    private String subject;
    private String correct;
    private String userName;
    private int game;
    
    public GameInfo(int round, int score, String subject, String correct, String userName, int game) {
        this.round = round;
        this.score = score;
        this.subject = subject;
        this.correct = correct;
        this.userName = userName;
        this.game = game;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }
}
