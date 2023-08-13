package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

// 커맨드의 구현체
// Light나 Button의 코드가 바뀐다면 구현체 역시 바뀌어야함
// 핵심은 invoker(호출자), 클라이언트(receiver)가 바뀌지 않는것
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
