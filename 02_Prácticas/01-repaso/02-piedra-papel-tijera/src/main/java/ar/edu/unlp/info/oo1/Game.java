package ar.edu.unlp.info.oo1;

public class Game {

    public Game(){}

    public String startMatch(Move moveOne, Move moveTwo){
        return moveOne.playAgainst(moveTwo);
    }
}
