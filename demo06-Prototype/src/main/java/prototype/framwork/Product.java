package prototype.framwork;

public interface Product {
    void use(String s);
    default Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
