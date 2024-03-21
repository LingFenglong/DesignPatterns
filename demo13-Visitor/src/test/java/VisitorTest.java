import org.junit.jupiter.api.Test;

public class VisitorTest {
    @Test
    void visitorTest() throws FileTreatmentException {
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
        logs.add(new File("today1.log", 10000));
        logs.add(new File("today2.log", 10000));
        logs.add(new File("today3.log", 10000));
        logs.add(new File("today4.log", 10000));
        logs.add(new File("today5.log", 10000));
        logs.add(new File("today6.log", 10000));
        logs.add(new File("today7.log", 10000));
        logs.add(new File("today8.log", 10000));
        logs.add(new File("today9.log", 10000));

//        Visitor visitor = new ListVisitor();
//        visitor.visit(root);

//        FileFindVisitor fileFindVisitor = new FileFindVisitor("l");
//        root.accept(fileFindVisitor);
//        fileFindVisitor.getFoundFiles()
//                .forEach(System.out::println);

//        System.out.println(todayLog.getSize());
//        SizeVisitor sizeVisitor = new SizeVisitor();
//        todayLog.accept(sizeVisitor);
//        System.out.println(sizeVisitor.getSize());

        Directory root2 = new Directory("root2");
        Directory dev2 = new Directory("dev2");
        Directory bin2 = new Directory("bin2");
        Directory tmp2 = new Directory("tmp2");
        Directory usr2 = new Directory("usr2");
        Directory home2 = new Directory("home2");
        Directory zhangsan = new Directory("zhangsan");

        root2.add(dev2);
        root2.add(bin2);
        root2.add(tmp2);
        root2.add(usr2);
        root2.add(home2);
        home2.add(zhangsan);

        ElementArrayList elements = new ElementArrayList();
        elements.add(root);
        elements.add(root2);
        elements.accept(new ListVisitor());
    }
}
