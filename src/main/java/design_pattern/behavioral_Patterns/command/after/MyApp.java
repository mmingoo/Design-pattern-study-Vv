package design_pattern.behavioral_Patterns.command.after;

import design_pattern.behavioral_Patterns.command.after.Button;
import design_pattern.behavioral_Patterns.command.after.Light;

import javax.smartcardio.CommandAPDU;

public class MyApp {

    public static void main(String[] args) {

        Button button1 = new Button(new LightOnCommand(new Light()));
        button1.press();

        Button button2 = new Button(new LightOffCommand(new Light()));
        button2.press();

    }
}
