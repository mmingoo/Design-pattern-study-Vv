package design_pattern.creational_patterns.factory_method.Monster.monster;

public class Dragon implements Monster {
    @Override
    public void attack() {
        System.out.println("오크가 몽둥이로 공격합니다!");
    }

    @Override
    public void defend() {
        System.out.println("오크가 방패로 방어합니다!");
    }

    @Override
    public String getName() {
        return "오크";
    }
}
