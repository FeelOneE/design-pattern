package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {
    
    // 도메인과 관련되어 간축하기 위해 자주 사용
    // 자바 코드에는 잘 없음
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);
        // 정석은 equals로 비교해야함
    }
}
