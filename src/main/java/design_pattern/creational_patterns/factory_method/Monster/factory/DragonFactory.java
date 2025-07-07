package design_pattern.creational_patterns.factory_method.Monster.factory;

import design_pattern.creational_patterns.factory_method.Monster.monster.Dragon;
import design_pattern.creational_patterns.factory_method.Monster.monster.Monster;

public class DragonFactory extends MonsterFactory{
    @Override
    public Monster createMonster() {
        return new Dragon();
    }
}
