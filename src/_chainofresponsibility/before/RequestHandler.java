package _chainofresponsibility.before;

public class RequestHandler {

    private Request request;

    public void handle(Request request) {
        System.out.println(request.getBody());
    }
}
