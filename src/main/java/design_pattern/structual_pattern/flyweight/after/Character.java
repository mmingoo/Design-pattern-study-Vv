package design_pattern.structual_pattern.flyweight.after;

import ch.qos.logback.core.boolex.EvaluationException;

import java.awt.*;

public class Character {

    char value;
    String color;
    Font font;

    Character(char value, String color, Font font){
        this.value = value;
        this.color= color;
        this.font = font;
    }

}
