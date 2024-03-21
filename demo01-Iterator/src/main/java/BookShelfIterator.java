public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int next = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return next < bookShelf.size();
    }

    @Override
    public Book next() {
        return bookShelf.get(next++);
    }
}
