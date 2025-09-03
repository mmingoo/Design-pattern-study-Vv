package design_pattern.behavioral_Patterns.visitor.after;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
