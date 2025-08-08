package design_pattern.behavioral_Patterns.mediator.after;

import design_pattern.behavioral_Patterns.mediator.after.CleaningService;
import design_pattern.behavioral_Patterns.mediator.after.Restaurant;

import java.time.LocalDateTime;

public class FrontDesk {

    private Restaurant restaurant = new Restaurant();

    private CleaningService cleaningService = new CleaningService();


    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTower(guest, numberOfTowers);
        System.out.println("수건을 가져다 드리겠습니다.");

    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest, dateTime);
        System.out.println(dateTime + "분에 식사가 예약됐습니다");
    }
}
