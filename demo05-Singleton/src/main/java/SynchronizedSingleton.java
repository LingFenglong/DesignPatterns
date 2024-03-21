public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton() {
        System.out.println("创建了一个实例");
    }

    public static SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            synchronized (SynchronizedSingleton.class) {
                if (synchronizedSingleton == null) {
                    synchronizedSingleton = new SynchronizedSingleton();
                }
            }
        }
        return synchronizedSingleton;
    }
}
