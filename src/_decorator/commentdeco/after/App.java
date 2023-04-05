package _decorator.commentdeco.after;

import _decorator.commentdeco.after.decorate.SpamFilteringCommentDecorator;
import _decorator.commentdeco.after.decorate.TrimmingDecorator;
import _decorator.commentdeco.after.service.CommentService;
import _decorator.commentdeco.after.service.DefaultCommentService;

public class App {
    private static boolean enableSpamFilter = true;
    private static boolean enableTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enableSpamFilter) {
            //스팸 필터 데코레이터 적용
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enableTrimming) {
            // 필요 없는 문자 자르기 데코레이터 적용
            commentService = new TrimmingDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어 게임");
        client.writeComment("보는 게 하는 거 보다 재밌을 수 없지...");
        client.writeComment("http://www.whiteship.me");
    }

}
