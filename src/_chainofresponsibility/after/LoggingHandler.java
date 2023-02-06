package _chainofresponsibility.after;

public class LoggingHandler extends RequestHandler {

    public LoggingHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("로깅이 됐는가?");
        super.handleRequest(request);
    }
}
