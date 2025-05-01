package ar.edu.unlp.info.oo1;

public class Spock implements Move {

    public Spock() {}

    @Override
    public String playAgainst(Move move) {
        return  move.playAgainstSpock();
    }

    @Override
    public String playAgainstRock() {
        return new Rock().playAgainstSpock();
    }
    @Override
    public String playAgainstPaper() {
        return new Paper().playAgainstSpock();
    }
    @Override
    public String playAgainstScissors() {
        return new Scissors().playAgainstSpock();
    }
    @Override
    public String playAgainstLizard() {
        return new Lizard().playAgainstSpock();
    }

    @Override
    public String playAgainstSpock() {
        return "Is a Draw";
    }
}
