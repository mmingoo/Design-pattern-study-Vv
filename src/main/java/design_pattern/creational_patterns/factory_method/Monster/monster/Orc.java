package design_pattern.creational_patterns.factory_method.Monster.monster;

public class Orc implements Monster{
    @Override
    public void attack() {
        System.out.println("드래곤이 불을 뿜습니다!");
    }

    @Override
    public void defend() {
        System.out.println("드래곤이 비늘로 방어합니다!");
    }

    @Override
    public String getName() {
        return "드래곤";
    }
}
