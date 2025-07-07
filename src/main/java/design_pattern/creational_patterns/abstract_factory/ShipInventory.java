package design_pattern.creational_patterns.abstract_factory;

import design_pattern.creational_patterns.abstract_factory.factory.Ship;
import design_pattern.creational_patterns.abstract_factory.factory.WhitePartsFactory;
import design_pattern.creational_patterns.abstract_factory.factory.WhitePartsProFactory;
import design_pattern.creational_patterns.abstract_factory.interf.ShipFactory;


public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        ShipFactory shipFactory2 = new WhiteShipFactory(new WhitePartsFactory());

        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}

