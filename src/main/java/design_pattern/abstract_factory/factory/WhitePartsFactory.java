package design_pattern.abstract_factory.factory;


import design_pattern.abstract_factory.interf.Anchor;
import design_pattern.abstract_factory.interf.ShipPartsFactory;
import design_pattern.abstract_factory.interf.Wheel;
import design_pattern.abstract_factory.nomal.WhiteAnchor;
import design_pattern.abstract_factory.nomal.WhiteWheel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WhitePartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
