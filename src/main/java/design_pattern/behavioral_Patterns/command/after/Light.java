package design_pattern.behavioral_Patterns.command.after;

public class Light {

    private boolean isOn;
    public void on(){
        System.out.println("불을 켭니다");
        this.isOn = true;
    }

    public void off(){
        System.out.println("불을 끝니다");
        this.isOn = false;
    }
}
