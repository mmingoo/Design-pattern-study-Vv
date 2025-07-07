package design_pattern.creational_patterns.factory_method.ship;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
