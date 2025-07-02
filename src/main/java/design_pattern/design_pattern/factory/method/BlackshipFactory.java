package design_pattern.design_pattern.factory.method;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
