package _facade.demeter;

public class Car {
    private Engine engine;

    public Car() {
    }

    public void start(Key key) {
        Door door = new Door();
        boolean isAuthorized = key.turns();
        if(isAuthorized) engine.start();
    }

}
