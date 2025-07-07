package design_pattern.creational_patterns.factory_method.ship;


public class Client {
    public static void main(String[] args) {
        System.out.println("프로그램 시작!");
        Client client = new Client();
        
        // 이제 Client는 구체적인 Factory를 직접 생성하지 않음!
        client.orderShip("white", "keesun@mail.com");
        client.orderShip("black", "keesun@mail.com");


//        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
//        client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }


    
    private void orderShip(String shipType, String email) {
        // Factory Provider를 통해 적절한 Factory를 받아옴
        ShipFactory factory = ShipFactoryProvider.getFactory(shipType);
        Ship ship = factory.orderShip(shipType + "ship", email);
        System.out.println("주문 완료: " + ship);
    }




    class ShipFactoryProvider {
        public static ShipFactory getFactory(String shipType) {
            switch (shipType.toLowerCase()) {
                case "white":
                    return new WhiteshipFactory();
                case "black":
                    return new BlackshipFactory();
                default:
                    throw new IllegalArgumentException("지원하지 않는 배 타입: " + shipType);
            }
        }
    }

}