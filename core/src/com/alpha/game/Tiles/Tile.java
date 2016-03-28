package com.alpha.game.Tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class Tile {
    private int gridX;
    private int gridY;
    private Texture icon;
    private int state;

    //Static textures to load
    private static Texture normalTile;

    public Tile (int x, int y) {
        gridX = x;
        gridY = y;
        if (normalTile == null) {
            loadStatic();
        }
        updateIcon();
    }

    void loadStatic() {
        normalTile = new Texture("normalTile.png");
    }

    void updateIcon() {
        switch (state) {
            default:
                icon = normalTile;
        }
    }

    public void update(float dt) {

    }

    public void draw(SpriteBatch sb) {
        float scale = 3;
        int width = 40;
        int height = 25;
        sb.draw(icon, (gridX * width) * scale, (gridY * height) * scale, icon.getWidth() * scale, icon.getHeight() * scale);
    }
}
