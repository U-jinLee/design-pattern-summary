package _chainofresponsibility.after;

public class Client {
    public static void main(String[] args) {
        RequestHandler chain = new AuthHandler(new LoggingHandler(new PrintRequestHandler(null)));
        chain.handleRequest(new Request("이번 놀이는 뽑기입니다."));
    }
}
