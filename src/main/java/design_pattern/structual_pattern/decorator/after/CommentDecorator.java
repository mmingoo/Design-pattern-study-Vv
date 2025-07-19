package design_pattern.structual_pattern.decorator.after;

public class CommentDecorator implements CommentService{
    CommentService commentService;

    CommentDecorator(CommentService commentService){
        this.commentService = commentService;
    }
    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
