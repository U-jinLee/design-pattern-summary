package _chainofresponsibility.after;

import _chainofresponsibility.after.Request;

public class Client {
    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthHandler(new LoggingHandler(new PrintRequestHandler(null)));
        chain.handleRequest(new Request("이번 놀이는 뽑기입니다."));
    }
}