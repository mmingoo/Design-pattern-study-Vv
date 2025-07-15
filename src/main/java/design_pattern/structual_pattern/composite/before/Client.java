package design_pattern.structual_pattern.composite.before;

import design_pattern.structual_pattern.composite.after.Component;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);


        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void  printPrice(Component component){
        component.getPrice();
    }


    // 아이템 전용 가격 반환 메서드가 필요
    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }


    // 가방용 전용 가격 반환 메서드가 필요
    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

}
