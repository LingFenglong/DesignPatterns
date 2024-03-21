import org.junit.jupiter.api.Test;
import properties.FileIO;
import properties.FileProperties;

import java.io.IOException;

public class PropertiesTest {
    @Test
    void propertiesTest() throws IOException {
        FileIO file = new FileProperties();
        file.readFromFile("D:\\git\\DesignPatterns\\demo02-Adapter\\src\\main\\resources\\file.txt");
        file.setValue("year", "2024");
        file.setValue("month", "1");
        file.setValue("day", "28");
        file.writeToFile("D:\\git\\DesignPatterns\\demo02-Adapter\\src\\main\\resources\\newFile.txt");
    }
}
