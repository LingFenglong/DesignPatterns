public class InnerClassSingleton {
    private static class SingletonInstance {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
