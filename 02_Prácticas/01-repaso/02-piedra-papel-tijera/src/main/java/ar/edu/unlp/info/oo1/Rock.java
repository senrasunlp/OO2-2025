package ar.edu.unlp.info.oo1;

public class Rock implements Move {

    public Rock() {}
    @Override
    public String playAgainst(Move move) {
        return  move.playAgainstRock();
    }

    @Override
    public String playAgainstRock() {
        return "Is a Draw";
    }
    @Override
    public String playAgainstPaper() {
        return "Paper wins";
    }
    @Override
    public String playAgainstScissors() {
        return "Rock wins";
    }
    @Override
    public String playAgainstLizard() {
        return "Rock wins";
    }

    @Override
    public String playAgainstSpock() {
        return "Spock wins";
    }
}
