package _decorator.commentdeco.after;

public class App {
    private static boolean enableSpamFilter = true;
    private static boolean enableTrimming = false;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enableSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enableTrimming) {
            commentService = new TrimmingDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어 게임");
        client.writeComment("보는 게 하는 거 보다 재밌을 수 없지...");
        client.writeComment("http://www.whiteship.me");
    }

}
