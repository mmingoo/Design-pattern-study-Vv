package design_pattern.behavioral_Patterns.command.after;

import design_pattern.behavioral_Patterns.command.after.Light;

public class LightOnCommand implements Command{
    Light light;

    LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();

    }
}
