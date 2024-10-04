package structural.proxy.after;

import structural.proxy.after.extend_solution.GameServiceProxyForExtends;
import structural.proxy.after.interface_solution.GameService;
import structural.proxy.after.interface_solution.DefaultGameService;
import structural.proxy.after.interface_solution.GameServiceProxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        // Class 상속을 사용하는 방법
        GameServiceProxyForExtends extendsGameService = new GameServiceProxyForExtends();
        extendsGameService.startGame();
        // Interface Proxy 방법
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();
        // Interface 초기화 지연
        gameService = new GameServiceProxy();
        gameService.startGame();

    }
}
