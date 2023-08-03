package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

// 인터페이스를 사용하면 코드가 좀 더 유연해짐
// DefaultGameService를 직접 상속하면 하나밖에 상속하지 못함
public interface GameService {

    void startGame();

}
