package me.whiteship.designpatterns._03_behavioral_patterns._14_command._03_java;

import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    // DB에 10만건의 데이터 멀티스레드로 insert하는데 다른 테이블이 락걸림
    // ?? 어떻게 해결하는게 나을까?
    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
