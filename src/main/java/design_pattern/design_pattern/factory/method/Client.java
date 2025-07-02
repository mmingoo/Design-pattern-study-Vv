package design_pattern.design_pattern.factory.method;

public class Client {
    public static void main(String[] args) {
        System.out.println("프로그램 시작!"); // 이 줄 추가
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackshipFactory(), "blackship","keesun@mail.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
