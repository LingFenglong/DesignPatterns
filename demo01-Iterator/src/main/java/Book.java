/**
 * book的实体类
 */
public class Book {
    private final String name;
    private final Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
