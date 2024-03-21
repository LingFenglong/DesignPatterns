import org.junit.jupiter.api.Test;

public class CompositeTest {
    @Test
    void compositeTest() throws FileTreatmentException {
        Directory root = new Directory("root");
        Directory dev = new Directory("dev");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        Directory home = new Directory("home");
        Directory lingfenglong = new Directory("lingfenglong");

        root.add(dev);
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        root.add(home);
        home.add(lingfenglong);

        bin.add(new File("vi", 1000));
        bin.add(new File("latex", 2000));
        lingfenglong.add(new File("bash.rc", 200));
        lingfenglong.add(new File("start.sh", 200));
        Directory logs = new Directory("logs");
        lingfenglong.add(logs);
        lingfenglong.add(new Directory("c++"));
        File todayLog = new File("today.log", 10000);
        logs.add(todayLog);

        root.printList();

        System.out.println(todayLog.getAbsolutePath());
        System.out.println(lingfenglong.getAbsolutePath());
    }
}
