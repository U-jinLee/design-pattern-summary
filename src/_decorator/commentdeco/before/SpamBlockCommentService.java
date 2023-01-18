package _decorator.commentdeco.before;

public class SpamBlockCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        super.addComment(filter(comment));
    }

    public String filter(String comment) {
        if(comment.contains("http")) return "";
        return comment;
    }
}
