package program.interpreter;

/**
 * repeat
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;
    @Override
    public void parse(Context context) throws ParserException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "repeat " + number + " " + commandListNode;
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++) {
            commandListNode.execute();
        }
    }
}
