package _decorator.commentdeco.after.decorate;

import _decorator.commentdeco.after.service.CommentService;

public class TrimmingDecorator extends CommentDecorator {
    public TrimmingDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
