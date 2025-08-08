package design_pattern.behavioral_Patterns.mediator.after;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class app {
    public static void main(String[] args) {
        Guest guest = new Guest();
        Gym gym = new Gym();
        Restaurant restaurant = new Restaurant();

        guest.getTowers(3);
        gym.cleanGym();

        restaurant.clean();

        guest.dinner(LocalDateTime.now());
    }
}
