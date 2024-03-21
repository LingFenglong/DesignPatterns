package properties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * {@link java.util.Properties}的Adapter
 */
public class FileProperties implements FileIO {
    private final Properties properties;
    private static final String COMMENTS = "Wrote by FileProperties";

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        this.properties.load(Files.newInputStream(Paths.get(filename)));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        this.properties.store(Files.newOutputStream(Paths.get(filename)), COMMENTS);
    }

    @Override
    public void setValue(String key, String value) {
        this.properties.put(key, value);
    }

    @Override
    public String getValue(String key) {
        return (String) this.properties.get(key);
    }
}
