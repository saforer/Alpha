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

    public BoardObject (int x, int y, String str) {
        gridX = x;
        gridY = y;
        icon = new Texture(str);
    }

    public void update(float dt) {

    }

    public void draw(SpriteBatch sb) {
        int tileSize = 32;
        sb.draw(icon, gridX * tileSize, gridY * tileSize);
    }
}
