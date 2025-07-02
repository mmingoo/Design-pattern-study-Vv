package design_pattern.design_pattern.factory.method;

public interface ShipFactory {
    // 배 주문
    default Ship orderShip(String name, String email){

        // 이메일이 유효한 지 검증
        validate(name, email);

        // 배 만들기 준비 중
        prepareFor(name);
        Ship ship = createShip();

        // 이메일 보내기
        sendToEmail(email, ship);
        return ship;
    }

    private void sendToEmail(String email, Ship ship){
        System.out.println(ship.getName() + "다 만들었습니다.");
    }

    Ship createShip();

    private void validate(String name,String email){
        if (name == null || name.isBlank() ){
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
    }

    private void prepareFor(String name){
        System.out.println(name + "만들 준비 중");
    }
}
