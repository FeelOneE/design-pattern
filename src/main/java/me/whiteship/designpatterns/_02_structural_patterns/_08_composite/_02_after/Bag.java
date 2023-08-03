package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// 이 클래스가 컴포짓이 됨
// 컴포넌트라는 공통 인터페이스를 의존해서 사용함
// 이때 Bag는 컴포짓(합성) 클래스로 컴포넌트와 집합관계(리스트)
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
