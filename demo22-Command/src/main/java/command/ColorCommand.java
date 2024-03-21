package command;

import drawer.Drawable;

import java.awt.*;

public class ColorCommand implements Command {
    private final Drawable drawable;
    private final Color color;

    public ColorCommand(Drawable drawable, Color color) {
        this.color = color;
        this.drawable = drawable;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
