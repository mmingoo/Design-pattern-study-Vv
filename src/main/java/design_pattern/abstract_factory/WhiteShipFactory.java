package design_pattern.abstract_factory;

import design_pattern.abstract_factory.factory.Ship;
import design_pattern.abstract_factory.factory.WhitePartsProFactory;
import design_pattern.abstract_factory.interf.ShipFactory;
import design_pattern.abstract_factory.interf.ShipPartsFactory;

public class WhiteShipFactory implements ShipFactory {
    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(WhitePartsProFactory whitePartsProFactory) {
        this.shipPartsFactory = whitePartsProFactory;
    }



    @Override
    public void sendEmailTo(String email, Ship ship) {

    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
