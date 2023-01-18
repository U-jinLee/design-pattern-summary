package _decorator.commentdeco.before;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new CommentService());

        client.writeComment("오징어 게임");
        client.writeComment("보는 게 하는 거 보다 재밌을 수 없지..");
        client.writeComment("https://www.com");

        System.out.println("");

        Client client2 = new Client(new TrimmingCommentService());

        client2.writeComment("오징어 게임");
        client2.writeComment("보는 게 하는 거 보다 재밌을 수 없지..");
        client2.writeComment("https://www.com");

        System.out.println("");

        Client client3 = new Client(new SpamBlockCommentService());

        client3.writeComment("오징어 게임");
        client3.writeComment("보는 게 하는 거 보다 재밌을 수 없지..");
        client3.writeComment("https://www.com");
    }
}
