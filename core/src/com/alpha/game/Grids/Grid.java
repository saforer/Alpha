package com.alpha.game.Grids;

import com.alpha.game.BoardObjects.BoardObject;
import com.alpha.game.Tiles.Tile;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Forer on 3/28/2016.
 */
public class Grid {
    Tile[][] tileArray;
    List<BoardObject> objList = new ArrayList<BoardObject>();
    final int width = 6;
    final int height = 3;

    public Grid () {
        tileArray = new Tile[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y] = new Tile(x,y);
            }
        }
    }

    public void update(float dt) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y].update(dt);
            }
        }

        for (BoardObject b : objList) {
            b.update(dt);
        }
    }

    public void draw(SpriteBatch sb) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y].draw(sb);
            }
        }

        for (BoardObject b : objList) {
            b.draw(sb);
        }
    }

    public void addObject(int x, int y, BoardObject bo) {
        bo.positionSet(x,y);
        objList.add(bo);
    }
}

