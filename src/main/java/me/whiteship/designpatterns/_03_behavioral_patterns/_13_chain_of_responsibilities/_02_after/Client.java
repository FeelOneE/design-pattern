package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before.Request;

// 핸들러 라는 공통의 인터페이스 존재
// 핸들러를 구현한 구현체들이 서로 연결되어 있음
// 클라이언트는 핸들러가 어떻게 연결되었는지 알 필요가 없음


 // 1. 프로그램이 다양한 방식으로 다양한 종류의 요청들을 처리할 것으로 예상되지만
 //                 정확한 요청 유형들과 순서들을 미리 알 수 없는 경우에 사용
 // 2. 특정 순서로 여러 핸들러를 실행해야 할 때 사용
 // 3. 핸들러들의 집합과 그들의 순서가 런타임에 변경되어야 할 때 사용
public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        // 계속 핸들러를 추가할 수 있고
        // 순서를 변경할 수 있음
        // 순차적인 필터를 사용할 때
        // 코드의 흐름이 많아지기 때문에 디버깅이 어려워짐

        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        // Auth 핸들러가 맨 처음 생성 되면
        // Auth의 nextHandler에 Loggin 핸들러가 지정
        // Logging 핸들러가 생성될 때 nextHandler에 Print 핸들러가 지정
        // Print 핸들러에 nextHandler가 null로 지정됨
        // null 일 때는 아무것도 하지 않고 패스
        // 이렇게 모든 핸들러가 연결된 상태 , 마치 연결 리스트 같음


        Client client = new Client(chain);
        client.doWork();
        // doWork에서 handle을 메서드를 호출
        // Auth 핸들러의 handle 매서드 호출
        // nexHandler의 handle 호출
        // 끝날 때 까지 반복 ~
    }
}
