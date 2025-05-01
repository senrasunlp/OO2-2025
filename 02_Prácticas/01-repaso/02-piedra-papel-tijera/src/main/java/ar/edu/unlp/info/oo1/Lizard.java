package ar.edu.unlp.info.oo1;

public class Lizard implements Move {

    public Lizard() {}

    @Override
    public String playAgainst(Move move) {
        return  move.playAgainstLizard();
    }
    @Override
    public String playAgainstRock() {
        return new Rock().playAgainstLizard();
    }
    @Override
    public String playAgainstPaper() {
        return new Paper().playAgainstLizard();
    }
    @Override
    public String playAgainstScissors() {
        return new Scissors().playAgainstLizard();
    }
    @Override
    public String playAgainstLizard() {
        return "Is a Draw";
    }

    @Override
    public String playAgainstSpock() {
        return "Lizard wins";
    }
}
