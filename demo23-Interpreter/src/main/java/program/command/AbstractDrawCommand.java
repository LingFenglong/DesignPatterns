package program.command;

import program.interpreter.Context;

public abstract class AbstractDrawCommand implements DrawCommand {
    protected final Context context;

    public AbstractDrawCommand(Context context) {
        this.context = context;
    }

    @Override
    public void addHistory() {
        context.getCommandHistory().push(this);
    }
}
