package design_pattern.design_pattern.factory.method.ship;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
    private String name;
    private String color;
    private String logo;

    @Override
    public String toString() {
        return "Ship{name='" + name + "', color='" + color + "', logo='" + logo + "'}";
    }

}
