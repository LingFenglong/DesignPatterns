package builder;

public abstract class Builder {
    public abstract Builder makeTitle(String title);
    public abstract Builder makeString(String str);
    public abstract Builder makeItems(String[] items);
    public abstract Builder close();
}
