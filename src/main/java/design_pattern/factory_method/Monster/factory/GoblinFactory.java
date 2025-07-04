package design_pattern.factory_method.Monster.factory;

import design_pattern.factory_method.Monster.monster.Goblin;
import design_pattern.factory_method.Monster.monster.Monster;

public class GoblinFactory extends MonsterFactory {
    @Override
    public Monster createMonster() {
        return new Goblin();
    }
}