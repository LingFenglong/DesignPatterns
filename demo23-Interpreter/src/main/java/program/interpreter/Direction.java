package program.interpreter;

import java.util.ArrayList;
import java.util.Arrays;

public enum Direction {
    UP("上"),
    DOWN("下"),
    LEFT("左"),
    RIGHT("右");

    private final String name;
    private static final ArrayList<Direction> directions = new ArrayList<>();
    static {
        directions.add(UP);
        directions.add(RIGHT);
        directions.add(DOWN);
        directions.add(LEFT);
    }
    Direction(String name) {
        this.name = name;
    }

    /**
     * 从 current 方向转向 turnTo 方向
     *
     * @param current 当前方向
     * @param turnTo  要转向的方向
     * @return
     */
    public static Direction turn(Direction current, Direction turnTo) {
        switch (turnTo) {
            case UP:
                return current;
            case DOWN:
                return directions.get((directions.indexOf(current) + 2) % 4);
            case LEFT:
                return directions.get((directions.indexOf(current) + 3) % 4);
            case RIGHT:
                return directions.get((directions.indexOf(current) + 1) % 4);
        }
        return current;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "name='" + name + '\'' +
                '}';
    }
}
