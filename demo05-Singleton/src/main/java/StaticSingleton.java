public class StaticSingleton {
    private static final StaticSingleton staticSingleton = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return staticSingleton;
    }
}
