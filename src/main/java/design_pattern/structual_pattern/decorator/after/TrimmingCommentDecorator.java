package design_pattern.structual_pattern.decorator.after;

public class TrimmingCommentDecorator extends CommentDecorator {
    TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        System.out.println("trim 실행");
        return comment.replace("...","");

    }


}
