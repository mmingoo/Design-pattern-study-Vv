package design_pattern.behavioral_Patterns.mediator.after;

import design_pattern.behavioral_Patterns.mediator.after.CleaningService;
import design_pattern.behavioral_Patterns.mediator.after.Guest;

import java.time.LocalDateTime;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest, LocalDateTime dateTime) {
        System.out.println("dinner " + guest + "/ dateTime: " + dateTime);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
