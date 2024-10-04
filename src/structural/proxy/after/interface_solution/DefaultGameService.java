package structural.proxy.after.interface_solution;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("달라란에 오신 것을 환영합니다!");
    }

}
