package design_pattern.behavioral_Patterns.mediator.after;

import design_pattern.behavioral_Patterns.mediator.after.Guest;
import design_pattern.behavioral_Patterns.mediator.after.Gym;
import design_pattern.behavioral_Patterns.mediator.after.Restaurant;

public class CleaningService {


    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + guest);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean " + restaurant);
    }
}
