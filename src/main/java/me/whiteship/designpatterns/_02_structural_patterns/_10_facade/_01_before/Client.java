package me.whiteship.designpatterns._02_structural_patterns._10_facade._01_before;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

// 스프링도 비노출을 지향함
// 스프링 코드를 직접 핸들링하는 것은 바람직하지 않음 (비지니스 로직을 만들 때)
// 유연한 구조를 항상 생각해야함

// 클라이언트는 여러 오퍼레이션을 사용하지 않고 압축된 하나의 오퍼레이션만 사용함 -> 퍼사드 패턴

public class Client {

    public static void main(String[] args) {
        String to = "keesun@whiteship.me";
        String from = "whiteship@whiteship.me";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        // 어떻게 추상화 할것인가?
        // 로직을 파악(정답은 없음)
        // EmailSender, EmailMassage, EmailSettings 로 나눔
        // EmailSender 가 EmailSettings 를 의존
        // 클라이언트 코드를 EmailSender로 보냄
        // EmailMassage 라는 객체를 주고 받음

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail from Java Program");
            message.setText("message");

            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
