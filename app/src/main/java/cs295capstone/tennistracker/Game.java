package cs295capstone.tennistracker;

import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Score score;
    public static int setsPerMatch; // must be an odd number
    public static int gamesPerSet; // generally it is 6
    private boolean deuceIsEnabled;
    private boolean player1Serves;

    public Game(Player player1, Player player2, Score score, int setsPerMatch, int gamesPerSet, boolean deuceIsEnabled) {
        this.player1 = player1;
        this.player2 = player2;
        this.score = score;
        this.setsPerMatch = setsPerMatch;
        this.gamesPerSet = gamesPerSet;
        this.deuceIsEnabled = deuceIsEnabled;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player 1: Heads or Tails?: ");
        String input = sc.next();
        if( input.equalsIgnoreCase(flipCoin()) ) {
            player1Serves = true;
        } else {
            player1Serves = false;
        }
        playMatch();
    }

    public void playMatch() {
        for(int set = 0; set < setsPerMatch; set++) {
            playSet();
        }
    }

    public void playSet() {
        for(int game = 0; game < gamesPerSet; game++) {
            if(player1Serves) {
                playGame(player1, player2);
            } else {
                playGame(player2, player1);
            }
        }
    }

    public void playGame(Player server, Player receiver) {
        playPoint();
    }

    public void playPoint() {

    }

    public String flipCoin() {
        if(Math.random() > .5)
            return "Heads";
        else
            return "Tails";
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
