package display;

import java.io.*;

public class TextFileDisplayImpl extends DisplayImpl {
    private final String filename;

    public TextFileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        System.out.println("------------------------------------------------------------------");
    }

    @Override
    public void rawPrint() {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("------------------------------------------------------------------");
    }
}
