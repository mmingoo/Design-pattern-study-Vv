package design_pattern.behavioral_Patterns.command.after;

public class GameOffCommand implements Command{
    Game game;
    public GameOffCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameOnCommand(this.game).execute();
    }
}
