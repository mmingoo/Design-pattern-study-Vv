package design_pattern.design_pattern.singleton.demo4;

public class Settings {
    // 방법4. static inner 클래스 사용

    private Settings(){}

    private static class SettingsHolder{
        private static final Settings Instance = new Settings();
    }

    public static  Settings getInstance(){
        return SettingsHolder.Instance;
    }

}
