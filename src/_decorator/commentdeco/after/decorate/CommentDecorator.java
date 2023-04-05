package _decorator.commentdeco.after.decorate;

import _decorator.commentdeco.after.service.CommentService;

public class CommentDecorator implements CommentService {
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }
    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }

}
