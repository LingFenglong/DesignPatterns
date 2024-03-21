import java.util.ArrayList;

/**
 * 书架集合类
 */
public class BookShelf implements Aggregate<Book> {
    private ArrayList<Book> books;

    public BookShelf(ArrayList<Book> books) {
        this.books = books;
    }

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public int size() {
        return books.size();
    }

    @Override
    public Book get(int index) {
        return books.get(index);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }
}
