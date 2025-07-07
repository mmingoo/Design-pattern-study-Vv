package design_pattern.creational_patterns.singleton.demo2;

public class Settings {
    // 방법2. 미리 싱글톤 객체를 생성해두는 방법
    private static final Settings instance = new Settings();


    private Settings(){}

    //방법 2.  미리 객체 생성
    public static  Settings getInstance(){
        // 미리 인스턴스를 생성해논 경우엔 바로 반환 가능
        return instance;
    }

}


//// 방법2. 미리 싱글톤 객체를 생성해두는 방법
//private static final Settings INSTANCE;
//
//static {
//    try {
//        INSTANCE = new Settings();
//    } catch (Exception e) {
//        throw new RuntimeException("Settings 인스턴스 생성에 실패했습니다.", e);
//    }
//}
//
//private Settings() throws Exception {
//    // 실제 초기화 로직 (예외를 던질 수 있음)
//    // new Settings() 호출하면 안됨!
//}
//
////방법 2. 미리 객체 생성
//public static Settings getInstance() {
//    // 미리 인스턴스를 생성해논 경우엔 바로 반환 가능
//    return INSTANCE;
//}