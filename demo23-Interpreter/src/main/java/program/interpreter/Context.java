package program.interpreter;

import program.command.CommandHistory;
import program.component.ProgramFrame;

import java.awt.*;
import java.util.StringTokenizer;

public class Context {
    private final StringTokenizer tokenizer;
    private final ProgramFrame programFrame;
    private String currentToken;
    private final Point currentPoint;
    private Color color;
    private Direction direction;
    private final CommandHistory commandHistory;
    private int step;

    public Context(String text) {
        this.tokenizer = new StringTokenizer(text);
        programFrame = new ProgramFrame(this);
        currentPoint = new Point(300, 200);
        direction = Direction.RIGHT;
        color = Color.red;
        commandHistory = new CommandHistory();
        step = 20;
        nextToken();
    }

    public void nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token) throws ParserException {
        if (!token.equals(currentToken)) {
            throw new ParserException(token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    public int currentNumber() throws ParserException {
        int num;
        try {
            num = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParserException(String.valueOf(e));
        }
        return num;
    }

    public Point toNextPoint() {
        switch (direction) {
            case UP:
                currentPoint.y += step;
                break;
            case DOWN:
                currentPoint.y -= step;
                break;
            case LEFT:
                currentPoint.x -= step;
                break;
            case RIGHT:
                currentPoint.x += step;
                break;
        }
        return currentPoint;
    }

    public ProgramFrame getProgramFrame() {
        return programFrame;
    }

    public Point getCurrentPoint() {
        return new Point(currentPoint);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void turn(Direction direction) {
        this.direction = Direction.turn(this.direction, direction);
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public CommandHistory getCommandHistory() {
        return commandHistory;
    }
}
