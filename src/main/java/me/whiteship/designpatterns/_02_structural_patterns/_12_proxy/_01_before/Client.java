package me.whiteship.designpatterns._02_structural_patterns._12_proxy._01_before;

public class Client {

    // 대리인 이라는 의미를 가지고 있음
    // 목적지 도달전에 캐싱을 통해 성능 향상이 가능

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        // 메서드 실행 시간을 측정하고 싶음, 앞뒤로 쓸 수 있지만 프로시 적용 가능
        gameService.startGame();
    }
}
