package design_pattern.behavioral_Patterns.memnto.after;

public final class GameSave {
    private final int redTeamScore;

    private final int blueTeamScore;


    public GameSave(Game game) {
        this.blueTeamScore = game.getBlueTeamScore();
        this.redTeamScore = game.getRedTeamScore();
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }
}
