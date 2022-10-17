package _factorymethod.pizza;

public class NyStyleCheesePizza extends Pizza {

    public NyStyleCheesePizza() {
        this.name = "뉴욕 스타일 소스와 치즈 피자";
        this.dough = "씬 크러스트 도우";
        this.sauce = "마리나라 소스";

        this.toppings.add("잘게 조각낸 레지아노 치즈");
    }
}
