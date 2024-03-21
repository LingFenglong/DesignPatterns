import org.junit.jupiter.api.Test;

public class IteratorTest {
    @Test
    void iteratorTest() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.add(new Book("aaa", 10.0));
        bookShelf.add(new Book("bbb", 7.99));
        bookShelf.add(new Book("ccc", 19.99));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
