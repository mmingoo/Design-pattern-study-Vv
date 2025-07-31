package design_pattern.structual_pattern.proxy.after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new ProxyGameService();
        gameService.startGame();
    }
}