package design_pattern.design_pattern.factory.method.Monster.factory;

import design_pattern.design_pattern.factory.method.Monster.monster.Dragon;
import design_pattern.design_pattern.factory.method.Monster.monster.Monster;

public class DragonFactory extends MonsterFactory{
    @Override
    public Monster createMonster() {
        return new Dragon();
    }
}
