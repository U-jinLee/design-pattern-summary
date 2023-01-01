package _strategy._before;

public class GreenLightRedLight {
    private int speed;

    public GreenLightRedLight(int speed) {
        this.speed = speed;
    }

    public void greenRight() {
        if(this.speed == 1) {
            System.out.println("무궁화 꽃이");
        } else if(this.speed == 2) {
            System.out.println("무궁화   꽃이");
        }

    }

    public void redright() {
        if(this.speed == 1) {
            System.out.println("피었습니다.");
        } else if(this.speed == 2) {
            System.out.println("피  었습니다!");
        }
    }
}
