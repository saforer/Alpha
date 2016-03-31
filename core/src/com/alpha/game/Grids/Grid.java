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

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y] = new Tile(x,y, true);
            }
        }

        for (int x = 3; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tileArray[x][y] = new Tile(x,y, false);
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
    
    public boolean canMoveTo(int x, int y, boolean friendly) {
        if (x < 0) return false;
        if (y < 0) return false;
        if (x > width-1) return false;
        if (y > height-1) return false;

        if (tileArray[x][y].isFriendly() ^ friendly) {
            return false;
        }
        
        for (BoardObject b : objList) {
            if (b.getGridX() == x && b.getGridY() == y) {
                //TODO: Not all objects will block, KEEP THIS IN MIND
                return false;
            }
        }
        
        return true;
    }
    
    public void addObject(int x, int y, BoardObject bo) {
        bo.positionSet(x,y);
        objList.add(bo);
    }
}

