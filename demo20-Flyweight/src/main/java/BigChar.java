import java.io.*;

public class BigChar {
    private final char charName;
    private final String fontData;

    public BigChar(char charName) {
        this.charName = charName;

        try (LineNumberReader reader = new LineNumberReader(new FileReader("D:\\git\\DesignPatterns\\demo20-Flyweight\\src\\main\\resources\\big" + charName + ".txt"));) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\r\n");
            }
            fontData = stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() {
        System.out.println(fontData);
    }

    public char getCharName() {
        return charName;
    }

    public String getFontData() {
        return fontData;
    }
}
