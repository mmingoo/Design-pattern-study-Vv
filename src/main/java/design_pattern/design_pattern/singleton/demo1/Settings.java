package design_pattern.design_pattern.singleton.demo1;

public class Settings {
    // 하나의 객체만 생성되도록, 아무나 접근하지 못하도록
    private static Settings instance;


    private Settings(){}
    //방법 1.  멀티스레드 환경
    public static synchronized Settings getInstance(){
        // 인스턴스가 생성되지 않았다면
        if (instance == null){
            // 인스턴스 생성
            instance = new Settings();
        }

        return instance;
    }


}
