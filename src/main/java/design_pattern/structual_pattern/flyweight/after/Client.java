package design_pattern.structual_pattern.flyweight.after;

public class Client {
    FontFactory fontFactory = new FontFactory();

    Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
    Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
    Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));

}
