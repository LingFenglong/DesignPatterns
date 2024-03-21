package listfactory;

import factory.Link;
import factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>")
                .append(caption)
                .append("<ul>");
        trays.forEach(link -> stringBuffer.append(link.makeHTML()));
        stringBuffer
                .append("</ul>")
                .append("</li>");
        return stringBuffer.toString();
    }
}
