package design_pattern.structual_pattern.decorator.after;

public class DefaultCommentService implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println("DefaultCommentService 실행");
       System.out.println(comment);
    }
}
