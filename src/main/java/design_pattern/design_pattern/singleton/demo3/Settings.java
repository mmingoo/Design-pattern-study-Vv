package design_pattern.design_pattern.singleton.demo3;

public class Settings {
    // 방법3. 더불체킹 기법
    private static volatile Settings instance;


    private Settings(){}

    //방법 3.  미리 객체 생성
    public static  Settings getInstance(){
        if(instance == null){
            synchronized (Settings.class){
                if (instance == null){
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

}
