package builder;

public class HtmlBuilder extends Builder {
    private boolean hasTitle = false;
    private final StringBuffer stringBuffer = new StringBuffer();
    @Override
    public Builder makeTitle(String title) {
        hasTitle = true;
        stringBuffer
                .append("<html><head><title>")
                .append(title)
                .append("</title></head><body>")
                .append("<h1>")
                .append(title)
                .append("</h1>");
        return this;
    }

    @Override
    public Builder makeString(String str) {
        if (!hasTitle) {
            throw new RuntimeException("must makeTitle first!");
        }
        stringBuffer.append("<p>").append(str).append("</p>");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        if (!hasTitle) {
            throw new RuntimeException("must makeTitle first!");
        }
        stringBuffer.append("<ul>");
        for (String item : items) {
            stringBuffer.append("<li>").append(item).append("</li>");
        }
        stringBuffer.append("</ul>");
        return this;
    }

    @Override
    public Builder close() {
        if (!hasTitle) {
            throw new RuntimeException("must makeTitle first!");
        }
        stringBuffer.append("</body></html>");
        return this;
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
