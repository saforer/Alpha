package com.alpha.game.BoardObjects;

import com.alpha.game.Grids.Grid;
import com.alpha.game.Manager.BattleManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class BoardObject {
    private int gridX;
    private int gridY;
    public int renderX;
    public int renderY;
    private Texture icon;
    //All things face to the right in the base picture, and if they don't face right in the game, we set the faceLeft to be true;
    private boolean friendly;
    int xOffset;
    int yOffset;

    //Moving stuffs
    public boolean moving = false;
    public float movementPercent = 0.0f;
    public int oldX;
    public int oldY;

    public BoardObject (String str, int xOffset, int yOffset, boolean friendly) {
        icon = new Texture(str);
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.friendly = friendly;
    }

    public BoardObject (int x, int y, String str, boolean friendly) {
        positionSet(x,y);
        icon = new Texture(str);
        this.friendly = friendly;
    }

    public void positionSet(int x, int y) {
        gridX = x;
        gridY = y;
        movementPercent = 1.0f;
        lerpPos();
        movementPercent = 0.0f;
    }

    public void lerpPos() {
        float scale = 3;
        int width = 40;
        int height = 25;
        renderX = (int) Math.floor(((oldX * width * scale)) + movementPercent * (((gridX * width * scale)) - (oldX * width * scale))) + (xOffset * 3);
        renderY = (int) Math.floor(((oldY * height * scale)) + movementPercent * (((gridY * height * scale)) - (oldY * height * scale)))  + yOffset;
    }

    public void update(float dt) {

    }
    
    public void preMove(Direction dir) {
        Grid currentGrid = BattleManager.getCurrentGrid();
        int posToLookX = gridX;
        int posToLookY = gridY;
        switch (dir) {
            default:
            case up:
                posToLookY++;
                break;
            case down:
                posToLookY--;
                break;
            case left:
                posToLookX--;
                break;
            case right:
                posToLookX++;
                break;
        }
        
        if (currentGrid.canMoveTo(posToLookX, posToLookY, friendly) && !moving) {
            move(dir);
        }
    }
    
    void move(Direction dir) {
        moving = true;
        oldX = gridX;
        oldY = gridY;
        switch (dir) {
            default:
            case up:
                gridY++;
                break;
            case down:
                gridY--;
                break;
            case left:
                gridX--;
                break;
            case right:
                gridX++;
                break;
        }
    }

    public void draw(SpriteBatch sb) {
        float scale = 3;
        float facing;
        int facingOffset;
        if (friendly) {
            facing = 1;
            facingOffset = 0;
        } else {
            facing = -1;
            facingOffset = icon.getWidth() * 3;
        }
        sb.draw(icon, renderX + facingOffset, renderY, facing * icon.getWidth() * scale, icon.getHeight() * scale);
    }

    public int getGridX() {
        return gridX;
    }

    public int getGridY() {
        return gridY;
    }
}


