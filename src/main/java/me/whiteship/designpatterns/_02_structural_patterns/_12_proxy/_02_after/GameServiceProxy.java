package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();

        // singletone의 lazy initialization을 활용하면 생성자 주입이 필요없음
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
