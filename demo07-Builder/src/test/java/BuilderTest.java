import builder.Director;
import builder.HtmlBuilder;
import builder.MarkdownBuilder;
import builder.TextBuilder;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    void textBuilderTest() {
        System.out.println(((TextBuilder) new Director(new TextBuilder()).construct()).getResult());
    }

    @Test
    void htmlBuilderTest() {
        System.out.println(((HtmlBuilder) new Director(new HtmlBuilder()).construct()).getResult());
    }

    @Test
    void markdownTest() {
        System.out.println(((MarkdownBuilder) new Director(new MarkdownBuilder()).construct()).getResult());
    }

    @Test
    void builderTest() {
        TextBuilder textBuilder = (TextBuilder) new TextBuilder()
                .makeTitle("Hello world!")
                .makeString("First")
                .makeItems(new String[]{"hahaha", "hehehe"})
                .makeString("Second")
                .makeItems(new String[]{"heiheihei", "hahaha", "hehehe"})
                .close();
        System.out.println(textBuilder.getResult());

        HtmlBuilder htmlBuilder = (HtmlBuilder) new HtmlBuilder()
                .makeTitle("Hello world!")
                .makeString("First")
                .makeItems(new String[]{"hahaha", "hehehe"})
                .makeString("Second")
                .makeItems(new String[]{"heiheihei", "hahaha", "hehehe"})
                .close();
        System.out.println(htmlBuilder.getResult());
    }
}
