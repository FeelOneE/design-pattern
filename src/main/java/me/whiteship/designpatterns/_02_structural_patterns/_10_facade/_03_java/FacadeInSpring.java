package me.whiteship.designpatterns._02_structural_patterns._10_facade._03_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;

public class FacadeInSpring {
    // 구체적인 기술을 뒤로 감추는게 주된 목적
    // Spring도 일종의 거대한 Facade라고 볼수 있음
    public static void main(String[] args) {
        MailSender mailSender = new JavaMailSenderImpl();

        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
    }
}
