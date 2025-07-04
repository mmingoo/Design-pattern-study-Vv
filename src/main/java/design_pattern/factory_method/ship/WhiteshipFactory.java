package design_pattern.factory_method.ship;

public class WhiteshipFactory implements ShipFactory{


    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
