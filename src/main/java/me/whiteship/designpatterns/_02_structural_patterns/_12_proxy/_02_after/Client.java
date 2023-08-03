package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

public class Client {

    public static void main(String[] args) {
        // 어떻게 캐싱한다는 거지?
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
