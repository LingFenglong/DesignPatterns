package program.component;

import program.command.DrawCommand;
import program.interpreter.Context;

import java.awt.*;

public class ProgramCanvas extends Canvas {
    private final Context context;
    public ProgramCanvas(Context context) throws HeadlessException {
        this.context = context;
        setBackground(Color.white);
        setSize(600, 400);
        setLocation(160, 120);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        context.getCommandHistory().getDrawCommands().forEach(DrawCommand::execute);
    }
}
