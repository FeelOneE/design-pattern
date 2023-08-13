package me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before;

// 요청을 처리하는 쪽과 요청을 수신하는 쪽을 분리하는 패턴
// 컨맨드라는 객체를 통해서!

public class MyApp {

    // 만약 light 에서 game으로 바꾸려고 한다면 클라이언트 코드를 모두 바꿔야함
    // 겹합이 높다!
    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
