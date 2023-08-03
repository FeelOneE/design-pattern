package me.whiteship.designpatterns._02_structural_patterns._07_bridge._03_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {
	
	// 구체적인 로그 클래스가 바뀌어도 LoggerFactory 는 바뀌지 않기 때문,
	// 구체적인 부분에 해당하는 인터페이스가 있으면 브릿지 패턴(?)

	// 기존 시스템에 추가 기능을 지속적으로 추가할 때 
    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.info("hello logger");
    }
}
