package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;

// Context, Expression 이라는 개념존대
// Context ??
// Expression 글로벌한 값들이 모여있는 것?
// Expression 은 TerminalExpression, NonTerminalExpression 이 존재

// 컴포짓 패턴과 매우 유사 -> ?? 어떻게 유사?

// ex) 123+- (postfix) -> xyz+-
// x,y,z 는 TerminalExpression
// +,- 는

public class App {

    public static void main(String[] args) {
        // 기능 확장의 경우 기존코드를 건들잊 ㅣ않아도 됨
        // 곱하기를 추가하고 싶다면 새로운 MultiflyExpression을 만들면 됨
        PostfixExpression expression = PostfixParser.parse("xyz+-a+"); // 우리가 원하는 문법으로 파싱
        //
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
        System.out.println(result);
    }
}
