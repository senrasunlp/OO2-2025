package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;

public class GameTest {

    Game game;
    Move rock,paper,scissors,lizard,spock;

    @BeforeEach
    public void setUp() {
        game = new Game();
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
        lizard = new Lizard();
        spock = new Spock();
    }
    @Test
    public void sameMovementIsADraw() {
        assertEquals("Is a Draw",game.startMatch(rock,rock));
    }

    @Test
    public void testRockWins(){
        assertEquals("Rock wins",game.startMatch(rock,scissors));
    }

    @Test
    public void testPaperWins(){
        assertEquals("Paper wins",game.startMatch(rock,paper));
    }

    @Test
    public void testScissorsWins(){
        assertEquals("Scissors wins",game.startMatch(paper,scissors));
    }
    @Test
    public void testSpockWins(){
        assertEquals("Spock wins",game.startMatch(scissors,spock));
    }

    @Test
    public void testLizardWins(){
        assertEquals("Lizard wins",game.startMatch(lizard,paper));
    }

}
