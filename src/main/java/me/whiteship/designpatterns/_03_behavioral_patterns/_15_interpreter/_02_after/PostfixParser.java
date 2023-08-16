package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Stack;

import static me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after.PostfixExpression.*;

public class PostfixParser {

    // xyz+-
    // +, plus z, y
    // push
    // -, minus

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                // 먼저 pop 되는 것을 오른쪽에
                PostfixExpression right = stack.pop();
                // 나중에 pop 되는 것을 왼쪽에
                PostfixExpression left = stack.pop();
                // xy-   -> x(pop(1))-y(pop(0)) 가 되어야 하니까
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }
}
