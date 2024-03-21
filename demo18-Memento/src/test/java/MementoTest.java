import game.Gamer;
import game.Memento;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;

public class MementoTest {
    @Test
    void mementoTest() {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("=======" + (i + 1));
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney());

            // 如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("赢了，存档！");
                memento = gamer.createMemento();
                System.out.println("存档后的状态：" + gamer);

            } else if (gamer.getMoney() < memento.getMoney()) {
                System.out.println("输了，回档！");
                gamer.restoreMemento(memento);
                System.out.println("回档后的状态：" + gamer);

            } else if (gamer.getFruits().size() > memento.getFruits().size()) {
                System.out.println("增加了水果，存档！");
                memento = gamer.createMemento();
                System.out.println("存档后的状态：" + gamer);
            }

            System.out.println();
            try { Thread.sleep(1000); } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }

    @Test
    void gameStartTest() throws IOException, ClassNotFoundException {
        String gameData = "D:\\git\\DesignPatterns\\demo18-Memento\\src\\main\\resources\\game.dat";
        File file = new File(gameData);
        if (!file.exists() && !file.createNewFile()) {
            System.out.println("创建文件失败");
            return;
        }

        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(file.toPath()));
        Memento memento = (Memento) objectInputStream.readObject();

        Gamer gamer = new Gamer(100);
        if (memento != null) {
            gamer.restoreMemento(memento);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("当前金钱：" + gamer.getMoney());
            System.out.println("当前水果：" + gamer.getFruits());
//        int money = new Random().nextInt(5000);
//        System.out.print("你的金钱随机化：" + money + "\n");
//        gamer.setMoney(money);
            gamer.bet();
            System.out.println("当前金钱：" + gamer.getMoney());
            System.out.println("当前水果：" + gamer.getFruits());
            System.out.println();
        }

        gamer.createMemento().saveToDisk(gameData);
        System.out.println("已保存到磁盘：" + gameData);
    }
}
