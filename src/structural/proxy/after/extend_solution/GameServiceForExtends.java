package structural.proxy.after.extend_solution;

import structural.proxy.after.interface_solution.GameService;

public class GameServiceForExtends implements GameService {

    @Override
    public void startGame() throws InterruptedException {
        System.out.println("달라란에 오신 것을 환영합니다!");
    }

}
