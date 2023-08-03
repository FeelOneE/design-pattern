package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public final class Font {
    // 모든 곳에서 공유하는 객체는 변하면 다른곳에 영향이 있을 수 있음
    // 반드시 불변(immutable) 하게 만들어야함 -> final

    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
