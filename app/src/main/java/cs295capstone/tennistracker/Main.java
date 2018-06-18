package cs295capstone.tennistracker;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("JOHN");
        Player player2 = new Player("COMPUTER");
        Score score = new Score();

        Game game = new Game(player1, player2, score, 1, 3, false);

    }
}
