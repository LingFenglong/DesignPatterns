package program.interpreter;

import java.util.ArrayList;

public class CommandListNode extends Node {
    private final ArrayList<CommandNode> list = new ArrayList<>();
    @Override
    public void parse(Context context) throws ParserException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParserException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                CommandNode commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public void execute() {
        list.forEach(Executor::execute);
    }
}
