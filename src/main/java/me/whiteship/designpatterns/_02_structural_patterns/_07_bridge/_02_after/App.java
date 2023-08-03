package me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after;

import me.whiteship.designpatterns._02_structural_patterns._07_bridge._01_before.Champion;

// 만약 챔피언 이라는 하나의 추상 클래스에서
// 각각의 챔피언의 스킨 클래스를 만든다면 기하급수적으로 코드가 늘어남

// !! 브릿지 패턴을 이용하자!!

// 챔피언, 스킨 이라는 계층적 구조를 만듬

// 챔피언 이라는 최상위 클래스 (추상)
// 최상위 클래스는 부가기능(스킨) 추상 클래스를 의존함
// 챔피언을 구현한(상속받은) 아리라는 구현 클래스 만듬
// 구현 클래스는 부가기능(스킨) 이라는 추상 클래스를 의존함
public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
