package _decorator.beveragedeco.beverage;

public abstract class Beverage {
    private String description = "제목 없음";
    private Size size = Size.TALL;

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Size getSize() {
        return this.size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

    public enum Size{
        TALL("톨 사이즈",.5),
        GRANDE("그랑데 사이즈",.8),
        VENTI("벤티 사이즈",.9);

        private String description;
        private double cost;
        Size(String description, double cost) {
            this.description = description;
            this.cost = cost;
        }

        public String getDescription() {
            return this.description;
        }
        public double getCost() {
            return this.cost;
        }
    }
}
