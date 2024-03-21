import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

public class FlyweightTest {
    @Test
    void memoryTest() {
        ArrayList<BigString> bigStrings = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            bigStrings.add(new BigString("1569874230"));
        }
//        for (int i = 0; i < 10000; i++) {
//            bigStrings.add(new BigString("1569874230", false));
//        }
//        bigStrings.forEach(BigString::print);

        Runtime runtime = Runtime.getRuntime();
        System.gc();
        long used = runtime.totalMemory() - runtime.freeMemory();
        System.out.println(used / 1024.0 / 1024 + "MB");
    }

    @Test
    void flyweightTest() {
        BigString bigString = new BigString("139742685");
        bigString.print();
    }

    @Test
    void generateTxt() throws IOException {
        String path = "D:\\git\\DesignPatterns\\demo20-Flyweight\\src\\main\\resources";
        File parent = new File(path);
        for (int i = 0; i <= 9; i++) {
            String filename = "big" + i + ".txt";
            File file = new File(parent, "big" + i + ".txt");
            if (!file.exists() && !file.createNewFile()) {
                System.out.println("创建文件" + filename + "失败");
                return;
            }
            try (PrintWriter writer = new PrintWriter(file)) {
                String s = String.valueOf(i).repeat(8) + "\r\n";
                writer.write(s);
                writer.write(s);
                writer.write(s);
                writer.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
