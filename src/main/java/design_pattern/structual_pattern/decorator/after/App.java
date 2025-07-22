package design_pattern.structual_pattern.decorator.after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        // 기본적인 코멘트서비스 기능 샹송
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            // 기본적인 코멘트 서비스 += 스팸 필터링 기능
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }


        /*
        * commentService 변수 → TrimmingCommentDecorator 객체
                                    ↳ commentService 필드 → SpamFilteringCommentDecorator 객체
                                                                       ↳ commentService 필드 → DefaultCommentService 객체

        *TrimmingCommentDecorator.addComment() 호출
        -> CommentDecorator.addComment() 호출
        -> SpamFilteringCommentDecorator.addComment() 호출
        -> CommentDecorator.addComment()
        -> DefaultCommentService.addComment() 호출

*
*
*
        [[[결론]]]
        *연쇄적으로 Decorator 패턴을 구현한 클래스들을 호출하는데, 중간에서 CommentDecorator 가 다리 역할

        * 이 때 연쇄적으로 Decorator 패턴을 구현한 클래스들이 호출되면서

        * 여러 기능들이 순차적으로 실행되는 것
        * */
        Client client = new Client(commentService);
//        client.writeComment("오징어게임");
        client.writeComment("http:보는게 하는거 보다 재밌을 수가 없지...");
//        client.writeComment("http://whiteship.me");
    }
}
