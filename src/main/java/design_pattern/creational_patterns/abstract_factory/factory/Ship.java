package design_pattern.creational_patterns.abstract_factory.factory;

import design_pattern.creational_patterns.abstract_factory.interf.Anchor;
import design_pattern.creational_patterns.abstract_factory.interf.Wheel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
    private String name;
    private String color;
    private String logo;
    private Wheel wheel;
    private Anchor anchor;

    @Override
    public String toString() {
        return "Ship{name='" + name + "', color='" + color + "', logo='" + logo + "'}";
    }

}
