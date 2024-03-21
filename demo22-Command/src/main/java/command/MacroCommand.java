package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    Deque<Command> commands = new ArrayDeque<>();

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    public Command undo() {
        if (!commands.isEmpty()) {
            return commands.pop();
        }
        return null;
    }

    public void clear() {
        commands.clear();
    }
}
