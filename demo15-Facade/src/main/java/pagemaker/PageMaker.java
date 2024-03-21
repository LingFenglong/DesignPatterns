package pagemaker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailto) {
        try {
            Properties properties = Database.getProperties();
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter("D:\\git\\DesignPatterns\\demo15-Facade\\src\\main\\resources\\index.html"));
            htmlWriter.title("这是欢迎页的标题，所以... 欢迎你！");
            htmlWriter.paragraph("这是一个段落");
            htmlWriter.link("这里应该是链接的");
            htmlWriter.mailto(properties.getProperty(mailto));
            htmlWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void makeLinkPage() {
        try {
            Properties properties = Database.getProperties();
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter("D:\\git\\DesignPatterns\\demo15-Facade\\src\\main\\resources\\links.html"));
            htmlWriter.title("这是链接页面的标题");
            properties.forEach((k, v) -> {
                try {
                    htmlWriter.link("[" + k + "]" + "(" + v + ")");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            htmlWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}