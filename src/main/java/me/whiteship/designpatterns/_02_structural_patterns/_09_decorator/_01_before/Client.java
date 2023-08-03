package me.whiteship.designpatterns._02_structural_patterns._09_decorator._01_before;


// 런타임에 기능를 추가하는 방법??
// 


public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
    	// 스팸 필터를 다른 기능으로 바꿔줄 수 있음
    	// But, 상속을 받아서 새로 만들어야 해서 복잡함, Trim 이라는 새로운 서비스를 만들면 스팸이 안되고,,
    	// 결국 스팸, Trim 모두 가능한 새로운 서비스(Client를 상속받은)를 새로 만들어야 함 -> 상속으로만 문제를 해결하려고 했을 때 단점!
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
