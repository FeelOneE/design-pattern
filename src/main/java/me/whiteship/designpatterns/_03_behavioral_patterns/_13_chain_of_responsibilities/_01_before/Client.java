package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

// 각각의 책임이 연결되어 있는것을 의미함
// 한 클래스가 하나의 책임만 가지고 있다 == 단일 책임 원칙 // 전제조건!!
// 이런 클래스를 연결한다는 것이 책임 연쇄 패턴


public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
