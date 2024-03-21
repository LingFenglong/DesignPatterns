package program.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {
    private final Deque<DrawCommand> drawCommands = new ArrayDeque<>();

    public void push(DrawCommand drawCommand) {
        drawCommands.push(drawCommand);
    }

    public DrawCommand pop() {
        return drawCommands.pop();
    }

    public Deque<DrawCommand> getDrawCommands() {
        return drawCommands;
    }
}
