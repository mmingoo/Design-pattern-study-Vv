package design_pattern.structual_pattern.adapter.bridge;

public class App {
    public static void main(String[] args) {
        Champion poolPary아리 = new 아리(new PoolParty());
        Champion Kda카이사 = new 카이사(new Kda());

        poolPary아리.skillE();
        poolPary아리.skillQ();

        Kda카이사.skillQ();
        Kda카이사.skillR();


    }
}
