package design_pattern.singleton.demo4;

public class App {
    // 방법 3. setting 이 사용될 때 setting 객체를 만들고 싶고
    // synchronize 의 성능 저하 이슈가 걱정될 때 더블 체킹 기법 사용
    public static void main(String[] args) {
        // 지금 여러개가 생김
        // 여러개가 생기지 못하도록 private 로 막아줌
//        Settings settings = new Settings();

        // 여기서 가져온 인스턴스와 Settings 클래스에서 반환하는 인스턴스가 같은지 확인
        Settings instance = Settings.getInstance();


        // 더블 체킹 기법으로 성능 저하 막을 수 있음
        System.out.println(instance == Settings.getInstance());

    }
}
