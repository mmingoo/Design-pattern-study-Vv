package design_pattern.singleton.demo1;

public class App {
    // 방법1. 멀티 스레드 환경에서 싱글톤 객체 만들기
    public static void main(String[] args) {
        // 지금 여러개가 생김
        // 여러개가 생기지 못하도록 private 로 막아줌
//        Settings settings = new Settings();

        // 여기서 가져온 인스턴스와 Settings 클래스에서 반환하는 인스턴스가 같은지 확인
        Settings instance = Settings.getInstance();

        System.out.println(instance == Settings.getInstance());

    }
}
