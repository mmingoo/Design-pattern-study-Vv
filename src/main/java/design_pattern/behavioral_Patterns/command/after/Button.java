package design_pattern.behavioral_Patterns.command.after;

public class Button {

    private Command command;
    private Light light;
    private Game game;

    public Button(Command command){
        this.command = command;
    }
//    public Button(Light light){
//        this.light = light;
//    }
//
//    public Button(Game gmae){
//        this.game = game;
//    }

    public void press(){
        this.command.execute();
    }
}
