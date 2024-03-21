/**
 * 表示集合的接口
 */
public interface Aggregate<T> {
    int size();
    T get(int index);
    Iterator<T> iterator();

    void add(T e);
}
