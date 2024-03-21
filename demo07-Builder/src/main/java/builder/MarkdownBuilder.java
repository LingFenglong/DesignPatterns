package builder;

public class MarkdownBuilder extends Builder {
    private final StringBuffer stringBuffer = new StringBuffer();

    @Override
    public Builder makeTitle(String title) {
        stringBuffer.append("# ").append(title).append("\n");
        return this;
    }

    @Override
    public Builder makeString(String str) {
        stringBuffer.append(str).append("\n");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (String item : items) {
            stringBuffer.append("- ").append(item).append("\n");
        }
        return this;
    }

    @Override
    public Builder close() {
        return this;
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
