package command;

import drawer.Drawable;

public class UndoCommand implements Command {
    private final Drawable drawable;
    private final MacroCommand history;

    public UndoCommand(Drawable drawable, MacroCommand history) {
        this.drawable = drawable;
        this.history = history;
    }

    @Override
    public void execute() {
        Command undo = history.undo();
        if (undo instanceof DrawCommand) {
            DrawCommand drawCommand = (DrawCommand) undo;
            drawable.erase(drawCommand.point.x, drawCommand.point.y);
        }
    }
}
