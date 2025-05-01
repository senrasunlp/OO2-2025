package ar.edu.unlp.info.oo1;

public class Scissors implements Move{

    public Scissors() {}

    @Override
    public String playAgainst(Move move) {
        return  move.playAgainstScissors();
    }

    @Override
    public String playAgainstRock() {
        return new Rock().playAgainstScissors();
    }
    @Override
    public String playAgainstPaper() {
        return new Paper().playAgainstScissors();
    }
    @Override
    public String playAgainstScissors() {
        return "Is a Draw";
    }
    @Override
    public String playAgainstLizard() {
        return "Scissors wins";
    }

    @Override
    public String playAgainstSpock() {
        return "Spock wins";
    }
}
