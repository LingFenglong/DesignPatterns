package program.command;

import program.component.ProgramCanvas;
import program.interpreter.Context;

import java.awt.*;

public class DrawStepCommand extends AbstractDrawCommand implements DrawCommand {
    private int x1, y1, x2, y2;

    public DrawStepCommand(Context context, int x1, int y1, int x2, int y2) {
        super(context);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public DrawStepCommand execute() {
        ProgramCanvas programCanvas = context.getProgramFrame().getProgramCanvas();
        Graphics2D graphics = (Graphics2D) programCanvas.getGraphics();
        graphics.setStroke(new BasicStroke(2.0f));
        graphics.setColor(context.getColor());
        graphics.drawLine(x1, y1, x2, y2);
        return this;
    }
}
