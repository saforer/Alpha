package com.alpha.game.BoardObjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class BoardObject {
    private int gridX;
    private int gridY;
    private Texture icon;
    private boolean faceLeft;

    public BoardObject (int x, int y, String str, boolean faceLeft) {
        gridX = x;
        gridY = y;
        icon = new Texture(str);
        this.faceLeft = faceLeft;
    }

    public void update(float dt) {

    }

    public void draw(SpriteBatch sb) {
        float scale = 3;
        int width = 40;
        int height = 25;
        int offsetX = 28;
        int offsetY = 13;
        float facing;
        if (faceLeft) {
            facing = 1;
        } else {
            facing = -1;
            offsetX += 62;
        }
        sb.draw(icon, (gridX * width * scale) + offsetX, (gridY * height * scale) + offsetY, facing * icon.getWidth() * scale, icon.getHeight() * scale);
    }
}
