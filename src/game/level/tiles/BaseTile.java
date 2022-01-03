package game.level.tiles;

import game.gfx.Screen;
import game.level.Level;

public class BaseTile extends Tile {

    protected int tileId;
    protected int tileColor;

    public BaseTile(int id, int x, int y, int tileColor) {
        super(id, false, false);
        this.tileId = x + y;
        this.tileColor = tileColor;
    }

    public void render(Screen screen, Level level, int x, int y) {
        screen.render(x, y, tileId, tileColor, 0, 1);
    }
}