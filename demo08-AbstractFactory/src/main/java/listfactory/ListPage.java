package listfactory;

import factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><head><meta charset=\"UTF-8\"><title>")
                .append(caption)
                .append("</title></head><body><h1>")
                .append(caption)
                .append("</h1><ul>");
        content.forEach(tray -> stringBuffer.append(tray.makeHTML()));
        stringBuffer
                .append("</ul><hr><address>")
                .append(author)
                .append("</address>")
                .append("</body></html>");
        return stringBuffer.toString();
    }
}
