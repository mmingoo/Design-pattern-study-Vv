package design_pattern.creational_patterns.factory_method.Monster.factory;

import design_pattern.creational_patterns.factory_method.Monster.monster.Monster;
import design_pattern.creational_patterns.factory_method.Monster.monster.Orc;

public class OrcFactory extends MonsterFactory{
    @Override
    public Monster createMonster() {
        return new Orc();
    }
}
