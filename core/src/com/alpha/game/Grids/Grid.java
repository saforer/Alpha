package com.alpha.game.Grids;

import com.alpha.game.BoardObjects.BoardObject;
import com.alpha.game.BoardObjects.TestObject;
import com.alpha.game.Tiles.Tile;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class Grid {
    Tile[][] tileArray;
    BoardObject[][] objArray;
    final int width = 6;
    final int height = 3;

    public Grid () {
        tileArray = new Tile[width][height];
        objArray = new BoardObject[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y] = new Tile(x,y);
            }
        }


        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < height; y++) {
                objArray[x][y] = new TestObject(x,y, false);
            }
        }

        for (int x = 3; x < 6; x++) {
            for (int y = 0; y < height; y++) {
                objArray[x][y] = new TestObject(x,y, true);
            }
        }
    }

    public void update(float dt) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y].update(dt);
            }
        }

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (objArray[x][y] != null) objArray[x][y].update(dt);
            }
        }
    }

    public void draw(SpriteBatch sb) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y].draw(sb);
            }
        }

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (objArray[x][y] != null) objArray[x][y].draw(sb);
            }
        }
    }
}

