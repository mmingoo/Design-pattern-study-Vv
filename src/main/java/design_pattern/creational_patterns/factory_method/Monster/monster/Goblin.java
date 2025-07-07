package design_pattern.creational_patterns.factory_method.Monster.monster;

public class Goblin implements Monster{
    @Override
    public void attack() {
        System.out.println("고블린이 단검으로 공격합니다!");
    }

    @Override
    public void defend() {
        System.out.println("고블린이 재빠르게 피합니다!");
    }

    @Override
    public String getName() {
        return "고블린";
    }
}

