package design_pattern.design_pattern.singleton.demo2;

public class App {

    //방법 2. 미리 만둘어 두는 경우
    public static void main(String[] args) {
        // 지금 여러개가 생김
        // 여러개가 생기지 못하도록 private 로 막아줌
//        Settings settings = new Settings();

        // 여기서 가져온 인스턴스와 Settings 클래스에서 반환하는 인스턴스가 같은지 확인
        Settings instance = Settings.getInstance();


        // 단점 : 매번 동기화 해줘야 하기 때문에 성능 저하 발생 가능
        // 자원이 남는 경우 미리 만두는 경우도 생각해볼 수 있음
        System.out.println(instance == Settings.getInstance());

    }
}
