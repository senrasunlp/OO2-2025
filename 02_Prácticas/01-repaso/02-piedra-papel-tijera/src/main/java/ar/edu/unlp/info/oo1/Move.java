package ar.edu.unlp.info.oo1;

public interface Move {

    public String playAgainst(Move move);
    public String playAgainstRock();
    public String playAgainstPaper();
    public String playAgainstScissors();
    public String playAgainstLizard();
    public String playAgainstSpock();

}
