package _factorymethod.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "시카고 스타일 소스와 치즈 피자";
        this.dough = "아주 두꺼운 크러스트 도우";
        this.sauce = "플럼토마토 소스";

        this.toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }

}