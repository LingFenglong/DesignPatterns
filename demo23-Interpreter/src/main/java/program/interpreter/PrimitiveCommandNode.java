package program.interpreter;

import program.command.DrawStepCommand;
import program.component.ProgramCanvas;

import java.awt.*;

/**
 * go
 * left
 * right
 * name
 */
public class PrimitiveCommandNode extends Node {
    private String name;
    private Context context;
    @Override
    public void parse(Context context) throws ParserException {
        this.context = context;
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("left") && !name.equals("right")) {
            throw new ParserException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void execute() {
        switch (name) {
            case "go":
                Point currentPoint = context.getCurrentPoint();
                Point nextPoint = context.toNextPoint();
                new DrawStepCommand(context, currentPoint.x, currentPoint.y, nextPoint.x, nextPoint.y)
                        .execute().addHistory();
                break;
            case "left":
                context.turn(Direction.LEFT);
                break;
            case "right":
                context.turn(Direction.RIGHT);
                break;
            default:
        }
    }
}
