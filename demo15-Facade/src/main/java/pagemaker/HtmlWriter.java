package pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private final Writer writer;
    protected HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    protected void title(String title) throws IOException {
        writer.write("标题：" + title + "\r\n");
    }

    protected void paragraph(String msg) throws IOException {
        writer.write("段落：" + msg + "\r\n");
    }

    protected void link(String link) throws IOException {
        writer.write("链接：" + link + "\r\n");
    }

    protected void mailto(String mailto) throws IOException {
        writer.write("发送邮件到：" + mailto + "\r\n");
    }

    protected void close() throws IOException {
        writer.close();
    }

}
