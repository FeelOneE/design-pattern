package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        
        // 처음 생성한 객체를 데코레이터를 상속받은 클래스에 넣어줌
        // CommentService에 부가 기능이 계속 추가됨
        // 기능 조합이 가능합!! -> 장점
        // 각각의 기능이 하나의 역할만 하기 때문에 단일책임 원칙 구현이 가능함
        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
