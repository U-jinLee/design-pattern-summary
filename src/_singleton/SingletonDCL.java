package _singleton;

public class SingletonDCL {
    private volatile static SingletonDCL INSTANCE;
    private SingletonDCL() {}

    public static SingletonDCL getInstance() {

        if(INSTANCE == null) {
            synchronized (SingletonDCL.class) {
                if(INSTANCE == null) INSTANCE = new SingletonDCL();
            }
        }

        return INSTANCE;
    }
}
