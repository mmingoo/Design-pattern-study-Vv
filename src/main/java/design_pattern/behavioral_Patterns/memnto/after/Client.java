package design_pattern.behavioral_Patterns.memnto.after;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave gameSave = new GameSave(game);

        game.setBlueTeamScore(132341);
        game.setRedTeamScore(12341);

        System.out.println("변경 전 레드팀 점수 : " + game.getRedTeamScore());
        System.out.println("변경 전 블루팀 점수 : " + game.getBlueTeamScore());


        game.restore(gameSave);

        System.out.println("변경 후 레드팀 점수 : " + game.getRedTeamScore());
        System.out.println("변경 후 블루팀 점수 : " + game.getBlueTeamScore());

    }
}
