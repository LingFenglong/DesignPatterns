public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        int count = generator.getNumber();
        System.out.println("GraphObserver: " + count);
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
        try { Thread.sleep(100); } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
