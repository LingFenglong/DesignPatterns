package builder;

public class TextBuilder extends Builder {
    private final StringBuffer stringBuffer = new StringBuffer();
    @Override
    public Builder makeTitle(String title) {
        stringBuffer
                .append("=================================================================================\n")
                .append("[").append(title).append("]\n");
        return this;
    }

    @Override
    public Builder makeString(String str) {
        stringBuffer.append("- ").append(str).append("\n");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (String item : items) {
            stringBuffer.append("\t* ").append(item).append("\n");
        }
        return this;
    }

    @Override
    public Builder close() {
        stringBuffer.append("=================================================================================\n");
        return this;
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
