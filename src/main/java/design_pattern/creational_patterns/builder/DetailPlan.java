package design_pattern.creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailPlan {
    private int day;

    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
    @Override
    public String toString() {
        return "DetailPlan{" +
                "day=" + day +
                ", plan='" + plan + '\'' +
                '}';
    }
}
