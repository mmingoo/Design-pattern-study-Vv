package design_pattern.structual_pattern.proxy.after;

public class ProxyGameService implements GameService{

    GameService gameService;

    @Override
    public void startGame() {
        if(gameService == null){

            // 지연 초기화
            gameService = new DefaultGameService();
            long before = System.currentTimeMillis();

            gameService.startGame();

            System.out.println("실행 시간 : "+ (before - System.currentTimeMillis())+"ms");
        }

    }


}
