package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;


// 감싸서 호출하는 역할??

public class CommentDecorator implements CommentService {

    private CommentService commentService;
    
    // 주입받기
    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
