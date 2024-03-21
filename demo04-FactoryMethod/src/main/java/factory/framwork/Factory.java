package factory.framwork;

public abstract class Factory<T extends Product> {
    protected abstract T createProduct(String owner);
    protected abstract void registerProduct(T product);
    public final T create(String owner) {
        T product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
