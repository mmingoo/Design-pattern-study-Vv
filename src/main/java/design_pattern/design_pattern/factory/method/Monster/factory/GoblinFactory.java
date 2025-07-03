package design_pattern.design_pattern.factory.method.Monster.factory;

import design_pattern.design_pattern.factory.method.Monster.monster.Goblin;
import design_pattern.design_pattern.factory.method.Monster.monster.Monster;

public class GoblinFactory extends MonsterFactory {
    @Override
    public Monster createMonster() {
        return new Goblin();
    }
}