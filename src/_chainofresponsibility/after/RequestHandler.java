package _chainofresponsibility.after;

import java.util.Objects;

public abstract class RequestHandler {
    /**
     * 다음에 실행할 검증
     * */
    private RequestHandler next;

    public RequestHandler(RequestHandler nextHandler) {
        this.next = nextHandler;
    }

    /**
     * Handle Request
     *
     * */
    public void handleRequest(Request request) {
        if(next != null) next.handleRequest(request);
    }
}
