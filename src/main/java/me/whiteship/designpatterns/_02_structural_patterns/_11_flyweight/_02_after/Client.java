package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Client {

    public static void main(String[] args) {
        // 메모리 사용량 감소 할 수 있음
        // 코드 복잡도 증가
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    }
}
