package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._01_before;

public class Client {

    public static void main(String[] args) {
        // fontFamily, fontSize 등을 Enum 으로 바꿀 수 있음
        // 자주 변하는 속성과 변하지 않는 속성 분리 -> 핵심 개념

        Character c1 = new Character('h', "white", "Nanum", 12);
        Character c2 = new Character('e', "white", "Nanum", 12);
        Character c3 = new Character('l', "white", "Nanum", 12);
        Character c4 = new Character('l', "white", "Nanum", 12);
        Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
