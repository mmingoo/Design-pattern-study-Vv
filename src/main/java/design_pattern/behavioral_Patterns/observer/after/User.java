package design_pattern.behavioral_Patterns.observer.after;

public class User implements Subscribe{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleMessage(String message){
        System.out.println(message);
    }

    public String getName() {
        return this.name;
    }
}
