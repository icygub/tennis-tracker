package cs295capstone.tennistracker;

public class Score {

    private int[][] score; // {[point][point], [game][game], [set][set]}

    public Score() {
        score = new int[3][2]; // [rows][columns]
        // sets all values to 0
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 2; c++) {
                score[r][c] = 0;
            }
        }
    }

    public int[] getSetScore() {
        int[] setScore = {score[2][0], score[2][1]};
        return setScore;
    }

    public void incrementSetScore() {
        
    }

//    public int[] getGameScore() {
//        return gameScore;
//    }
//
//    public void setGameScore(int[] gameScore) {
//        this.gameScore = gameScore;
//    }
//
//    public int[] getPointScore() {
//        return pointScore;
//    }
//
//    public void setPointScore(int[] pointScore) {
//        this.pointScore = pointScore;
//    }
}
