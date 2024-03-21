public class HahaObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print((i + 1) + "：哈哈 ");
        }
    }
}
