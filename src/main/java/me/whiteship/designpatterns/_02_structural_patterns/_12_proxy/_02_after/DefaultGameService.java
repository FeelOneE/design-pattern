package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;


// 기존 코드에 해당함
// 기존 코드를 변경하지 않고 프록시 클래스로 기능을 추가할 수 있음
// open closed 원칙
// 단일책임 원칙
public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
    }
}
