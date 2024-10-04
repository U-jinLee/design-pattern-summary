package structural.proxy.after.interface_solution;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy() {}

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() throws InterruptedException {
        //Lazy initializer 적용
        if (this.gameService == null) {
            System.out.println("Lazy initializer 적용");
            this.gameService = new DefaultGameService();
        }

        long before = System.currentTimeMillis();
        timeToApproachJaina();
        gameService.startGame();
        System.out.println("달라란에 접근 소유 시간:" + (System.currentTimeMillis() - before));
    }

    private void timeToApproachJaina() throws InterruptedException {
        //1초가 걸린다 가정
        Thread.sleep(1000);
    }
}
