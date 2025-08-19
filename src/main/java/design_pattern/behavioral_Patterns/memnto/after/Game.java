package design_pattern.behavioral_Patterns.memnto.after;

public class Game{

    private int redTeamScore;

    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public void restore(GameSave save){
        this.redTeamScore = save.getRedTeamScore();
        this.blueTeamScore = save.getBlueTeamScore();
    }
}
