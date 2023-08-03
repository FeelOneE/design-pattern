package me.whiteship.designpatterns._02_structural_patterns._12_proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("bean(gameService)") // Bean으로 등록한 것만 AOP를 적용할 수 있음 -> 그럼 여러 Bean을 등록하기 위해서는 똑같은 코드를 여러번 써애하나?
    // Around 는 다양한 표현식이 존재함
    public void timestamp(ProceedingJoinPoint point) throws Throwable {
        long before = System.currentTimeMillis();
        point.proceed();
        System.out.println(System.currentTimeMillis() - before);
    }
}
