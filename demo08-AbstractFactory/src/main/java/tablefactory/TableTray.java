package tablefactory;

import factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<tr><th>").append(caption).append("</th></tr>")
                .append("<tr>");
        trays.forEach(link -> stringBuffer.append(link.makeHTML()));
        stringBuffer.append("</tr>");
        return stringBuffer.toString();
    }
}
