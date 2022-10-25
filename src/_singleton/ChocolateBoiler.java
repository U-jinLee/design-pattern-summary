package _singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler INSTANCE;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ChocolateBoiler();
        }
        return INSTANCE;
    }

    public void fill() {
        if(isEmpty()) {
            this.empty = false;
            this.boiled = false;
        }
    }
    public void drain() {
        if(isEmpty() && isBoiled()) {
            this.empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            this.boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

}
