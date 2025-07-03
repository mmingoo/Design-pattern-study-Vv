package design_pattern.design_pattern.factory.method.Monster.factory;

import design_pattern.design_pattern.factory.method.Monster.monster.Monster;
import design_pattern.design_pattern.factory.method.Monster.monster.Orc;

public class OrcFactory extends MonsterFactory{
    @Override
    public Monster createMonster() {
        return new Orc();
    }
}
