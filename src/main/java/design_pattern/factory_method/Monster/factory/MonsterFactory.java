package design_pattern.factory_method.Monster.factory;

import design_pattern.factory_method.Monster.monster.Monster;

abstract public class MonsterFactory {
    // 팩토리 메서드 - 서브클래스에서 구현
    public abstract Monster createMonster();

    // 공통 기능
    public void spawnMonster() {
        Monster monster = createMonster();
        System.out.println(monster.getName() + "이(가) 생성되었습니다!");
        monster.attack();
        monster.defend();
    }
}
