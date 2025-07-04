package design_pattern.abstract_factory.factory;

import design_pattern.abstract_factory.interf.Anchor;
import design_pattern.abstract_factory.interf.ShipPartsFactory;
import design_pattern.abstract_factory.interf.Wheel;
import design_pattern.abstract_factory.nomal.WhiteAnchor;
import design_pattern.abstract_factory.nomal.WhiteWheel;
import design_pattern.abstract_factory.pro.WhiteAnchorPro;
import design_pattern.abstract_factory.pro.WhiteWheelPro;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
