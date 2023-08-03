package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        // 객체의 의존성은 어쩔 수 없지만
        // 객체를 교체하기 더 쉽다? -> 객체들간의 의존성이 낮아졌다고 볼 수 있는가?
        // 조삼모사 아닌가? -> 어짜피 로직이 뒤로 가는데?
        // 비지니스 로직이 여러군데에서 쓰인다면
        // ex) 이메일 세팅을 바꾼다면? 클라이언트 코드를 모두 바꿔야함
        // 객체로 묶어 놨으니 좀 더 유연하다고 할 수 있음

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("keesun");
        emailMessage.setTo("whiteship");
        emailMessage.setCc("일남");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
    }
}
