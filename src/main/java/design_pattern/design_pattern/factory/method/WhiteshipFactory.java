package design_pattern.design_pattern.factory.method;

public class WhiteshipFactory implements ShipFactory{


    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
