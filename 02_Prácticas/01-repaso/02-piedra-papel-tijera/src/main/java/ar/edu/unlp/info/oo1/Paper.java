package ar.edu.unlp.info.oo1;

public class Paper implements Move{

    public Paper() {}
    @Override
    public String playAgainst(Move move) {
        return  move.playAgainstPaper();
    }

    @Override
    public String playAgainstRock() {
        return new Rock().playAgainstPaper();
    }
    @Override
    public String playAgainstPaper() {
        return "Is a Draw";
    }
    @Override
    public String playAgainstScissors() {
        return "Scissors wins";
    }
    @Override
    public String playAgainstLizard() {
        return "Lizard wins";
    }

    @Override
    public String playAgainstSpock() {
        return "Paper wins";
    }
}
