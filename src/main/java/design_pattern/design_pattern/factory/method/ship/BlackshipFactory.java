package design_pattern.design_pattern.factory.method.ship;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
