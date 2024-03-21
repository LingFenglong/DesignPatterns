package tablefactory;

import factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><head><meta charset=\"UTF-8\"><title>")
                .append(caption)
                .append("</title></head><body><h1>")
                .append(caption)
                .append("</h1><table border=\"1px\">");
        content.forEach(tray -> stringBuffer.append(tray.makeHTML()));
        stringBuffer
                .append("</table><hr><address>")
                .append(author)
                .append("</address>")
                .append("</body></html>");
        return stringBuffer.toString();
    }
}
