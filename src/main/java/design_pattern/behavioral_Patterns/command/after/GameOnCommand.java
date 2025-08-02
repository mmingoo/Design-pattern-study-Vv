package design_pattern.behavioral_Patterns.command.after;

public class GameOnCommand implements Command{
    Game game;
    public GameOnCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameOffCommand(this.game).execute();
    }
}
