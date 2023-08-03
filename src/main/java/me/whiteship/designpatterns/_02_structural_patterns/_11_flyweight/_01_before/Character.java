package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._01_before;

public class Character {
    // 변하는 속성은 도메인의 특성에 따라 다름
    // 도메인 파악이 필요함
    //
    private char value;

    private String color;

    private String fontFamily;

    private int fontSize;

    public Character(char value, String color, String fontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
