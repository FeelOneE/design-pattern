package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._01_before;

import java.util.Stack;
// 인터프리터는 일반적으로 통역의 의미
// 언제 쓰이나? 자주 해결해야하는 문제(문법, 패턴) 식별, -> 우리만의 언어로 작성할 수 있다
// ex) 정규표현식


public class PostfixNotation {

    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        // 123 대신 xyz를 넣고싶다 -> 인터프리터 패턴 적용 가능
        // 문법 자체를 만드는 것 (?)
        postfixNotation.calculate();
    }

    // postfix 수식 계산
    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        System.out.println(numbers.pop());
    }
}
