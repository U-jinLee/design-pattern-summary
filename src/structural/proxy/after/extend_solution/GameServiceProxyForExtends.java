package structural.proxy.after.extend_solution;

public class GameServiceProxyForExtends extends GameServiceForExtends {
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        //1초가 걸린다 가정
        Thread.sleep(1000);
        super.startGame();
        System.out.println("달라란에 접근 소유 시간:" + (System.currentTimeMillis() - before));
    }
}
