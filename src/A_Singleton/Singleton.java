package A_Singleton;

public class Singleton {
    private static class singleToneHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return singleToneHolder.INSTANCE;
    }
}
