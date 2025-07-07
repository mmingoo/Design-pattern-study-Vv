package design_pattern.creational_patterns.abstract_factory.factory;

import design_pattern.creational_patterns.abstract_factory.interf.Anchor;
import design_pattern.creational_patterns.abstract_factory.interf.ShipPartsFactory;
import design_pattern.creational_patterns.abstract_factory.interf.Wheel;
import design_pattern.creational_patterns.abstract_factory.pro.WhiteAnchorPro;
import design_pattern.creational_patterns.abstract_factory.pro.WhiteWheelPro;

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
