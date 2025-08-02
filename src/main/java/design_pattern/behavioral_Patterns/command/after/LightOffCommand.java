package design_pattern.behavioral_Patterns.command.after;

import design_pattern.behavioral_Patterns.command.after.Light;

public class LightOffCommand implements Command{
    Light light;

    LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();

    }
}
