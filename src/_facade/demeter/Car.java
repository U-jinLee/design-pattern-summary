package _facade.demeter;

public class Car {
    /**
     * 4. 클래스의 구성 요소
     * */
    private Engine engine;

    public Car() {
    }

    public void start(Key key) {
        // 3. 메서드 생성 or 인스턴스 객체
        Door door = new Door();
        // 2. 메서드에 매개변수로 전달된 객체
        boolean isAuthorized = key.turns();
        // 4. 객체에 속하는 구성요소
        if(isAuthorized) engine.start();
        // 1. 객체 자체의 메서드를 사용
        updateDashboardDisplay();
        // 3. 메서드 생성 or 인스턴스 객체
        door.lock();
    }
    public void updateDashboardDisplay() {
        // 객체 내부에 구현된 메서드
    }
}
