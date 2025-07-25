package design_pattern.structual_pattern.decorator.after;

public class SpamFilteringCommentDecorator extends CommentDecorator{


    SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if(!isNotSpam(comment)){
            super.addComment(comment);
        }


    }

    private boolean isNotSpam(String comment) {
        System.out.println("spam 실행");

        return !comment.contains("http");
    }
}
