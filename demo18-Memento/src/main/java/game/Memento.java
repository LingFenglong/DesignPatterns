package game;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Memento implements Serializable {
    private int number;
    int money;
    ArrayList<String> fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<String> getFruits() {
        return new ArrayList<>(fruits);
    }

    int getNumber() {
        return number;
    }

    public void saveToDisk(String gameData) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(gameData)));
        objectOutputStream.writeObject(this);
    }
}
