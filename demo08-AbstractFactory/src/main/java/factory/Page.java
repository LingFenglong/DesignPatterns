package factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Page extends Item {
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String caption, String author) {
        super(caption);
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = caption + ".html";
            FileWriter fileWriter = new FileWriter("D:\\git\\DesignPatterns\\demo08-AbstractFactory\\src\\main\\resources\\" + filename);
            fileWriter.write(this.makeHTML());
            fileWriter.close();
            System.out.println(filename + " 编写完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
