package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

// 커맨드라는 인터페이스의 execute 만 사용함
// 컨맨드의 구현체들의 execute만 호출하여 사용
// Invoker는 Button, Light 등이 될 수 있음

// Java의 Runnable이 있음!

public interface Command {

    void execute();

    void undo();

}
