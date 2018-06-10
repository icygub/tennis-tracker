package cs295capstone.tennistracker;

public class Game {

    private Player player1;
    private Player player2;
    private Score score;
    private int numberOfSets; // must be an odd number
    private int matchesPerSet; // generally it is 6
    private boolean deuceIsEnabled;

    public Game(Player player1, Player player2, Score score, int numberOfSets, int matchesPerSet, boolean deuceIsEnabled) {
        this.player1 = player1;
        this.player2 = player2;
        this.score = score;
        this.numberOfSets = numberOfSets;
        this.matchesPerSet = matchesPerSet;
        this.deuceIsEnabled = deuceIsEnabled;
    }
}
