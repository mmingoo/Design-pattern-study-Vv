package design_pattern.abstract_factory;

import design_pattern.abstract_factory.factory.Ship;
import design_pattern.abstract_factory.factory.WhitePartsProFactory;
import design_pattern.abstract_factory.interf.ShipFactory;


public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
