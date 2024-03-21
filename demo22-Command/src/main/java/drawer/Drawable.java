package drawer;

import java.awt.*;

public interface Drawable {
    void draw(int x, int y);
    void erase(int x, int y);
    void setColor(Color color);
}
