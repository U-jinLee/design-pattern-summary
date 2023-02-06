package _chainofresponsibility.after;

public class AuthHandler extends RequestHandler {

    public AuthHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("인증이 됐는가?");
        super.handleRequest(request);
    }
}
