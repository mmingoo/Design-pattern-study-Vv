package design_pattern.behavioral_Patterns.mediator.after;

public class Gym {
    CleaningService cleaningService = new CleaningService();

    public void cleanGym(){
        cleaningService.clean(this);
    }
}
