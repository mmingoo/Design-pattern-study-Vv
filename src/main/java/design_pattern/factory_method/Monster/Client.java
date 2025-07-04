package design_pattern.factory_method.Monster;

import design_pattern.factory_method.Monster.factory.DragonFactory;
import design_pattern.factory_method.Monster.factory.GoblinFactory;
import design_pattern.factory_method.Monster.factory.MonsterFactory;
import design_pattern.factory_method.Monster.factory.OrcFactory;

public class Client {
    public static void main(String[] args) {

        // 게임 상황에 따라 다른 팩토리 사용
        MonsterFactory factory;

        // 초보자 구역 - 고블린 생성
        System.out.println("=== 초보자 구역 ===");
        factory = new GoblinFactory();
        factory.spawnMonster();

        System.out.println();

        // 중급자 구역 - 오크 생성
        System.out.println("=== 중급자 구역 ===");
        factory = new OrcFactory();
        factory.spawnMonster();

        System.out.println();

        // 고급자 구역 - 드래곤 생성
        System.out.println("=== 고급자 구역 ===");
        factory = new DragonFactory();
        factory.spawnMonster();
    }
}
