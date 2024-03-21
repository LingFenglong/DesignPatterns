package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int number;
    private int money;
    private List<String> fruits = new ArrayList<>();
    private final Random random = new Random();
    private static final String[] fruitNames = {
            "苹果", "葡萄", "香蕉", "橘子"
    };
    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("金钱 + 100");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("金钱 / 2");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果 " + f);
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        fruits.forEach(m::addFruit);
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
        this.number = memento.getNumber();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "number=" + number +
                ", money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    public String getFruit() {
        return fruitNames[random.nextInt(fruitNames.length)];
    }

    public List<String> getFruits() {
        return fruits;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
